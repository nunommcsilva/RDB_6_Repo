package pt.rumos.bank.administration.service;

import pt.rumos.bank.administration.RumosADM;
import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.model.Customer;
import pt.rumos.bank.administration.model.DebitCard;
import pt.rumos.bank.administration.model.CreditCard;

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

//import java.util.Date;
import java.util.Scanner;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class CustomerService {

    private DebitCardService dcs = new DebitCardService();
    private CreditCardService ccs = new CreditCardService();

    Scanner KB = new Scanner(System.in);
//______________________________________________________________//	

    public Customer createCustomer() {

        Customer c = new Customer();

        System.out.println("Please insert customer�s data.");
        System.out.println("Inserir o NIF: ");
        c.setNif(KB.nextLine());
        System.out.println("O NIF �: " + c.getNif());

        System.out.println("Inserir o nome: ");
        c.setName(KB.nextLine());
        System.out.println("O nome �: " + c.getName());

        //LocalDate date = LocalDate.parse("2020-01-08");
        System.out.println("Inserir a data de nascimento "
                + "segundo o formato yyyy-MM-dd: ");
        LocalDate date = LocalDate.parse(KB.nextLine());
        c.setDob(date);
        System.out.println("The birth date is: " + c.getDob());

        /*System.out.println("Inserir a data de nascimento " 
		+ "segundo o formato yyyy, MM, dd ");		
		 //c.setDob(KB.next ());
		 c.setDob("2000-01-01");		
		 //LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 c.setDob(KB.next ());		 
                 SimpleDateFormat format=new SimpleDateFormat();
		 Date date1=format.parse(date);                  		 
		 Object LocalDate1 = keyboard.nextLine();
                  Scanner keyboard;
		 dob1 LocalDate = keyboard.nextLine();
                  c.setDob(keyboard.nextLine());
		 c.setDob(KB.nextLocalDate());*/
        //
        //
        System.out.println("Inserir o Telefone: ");
        c.setTelephone(KB.nextLine());
        System.out.println("O Telefone �: " + c.getTelephone());

        System.out.println("Inserir o Telem�vel: ");
        c.setCellphone(KB.nextLine());
        System.out.println("O Telem�vel �: " + c.getCellphone());

        System.out.println("Inserir o E-Mail: ");
        c.setEmail(KB.nextLine());
        System.out.println("O E-Mail �: " + c.getEmail());

        System.out.println("Inserir a profiss�o: ");
        c.setOccupation(KB.nextLine());
        System.out.println("A profiss�o �: " + c.getOccupation());
//

        System.out.println("Deseja criar um cart�o de d�bito?");
        System.out.println("1 - Sim");
        System.out.println("2 - N�o");
        int option = KB.nextInt();
        /*
		 * if (option == 1) { DebitCard dc = dcs.createDebitCard(); c.setDebitCard(dc);
		 * // } else { System.out.println("Deseja criar um cart�o de cr�dito?");
		 * System.out.println("1 - Sim"); System.out.println("2 - N�o"); if (option ==
		 * 1) { CreditCard cc = ccs.createCreditCard(); c.setCreditCard(cc); } } else {
		 * System.out.println("Deseja criar um cart�o de cr�dito?");
		 * System.out.println("1 - Sim"); System.out.println("2 - N�o"); if (option ==
		 * 1) { CreditCard cc = ccs.createCreditCard(); c.setCreditCard(cc); } }
         */
        switch (option) {
            case 1:
                DebitCard dc = dcs.createDebitCard();
                c.setDebitCard(dc);
                break;
            case 2:
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
        }
//

        System.out.println("Deseja criar um cart�o de cr�dito?");
        System.out.println("1 - Sim");
        System.out.println("2 - N�o");
        int option1 = KB.nextInt();
        switch (option1) {
            case 1:
                CreditCard cc = ccs.createCreditCard();
                c.setCreditCard(cc);
                break;
            case 2:
                break;
            default:
                System.out.println("Op��o inv�lida");
                break;
        }

        // DebitCard dc = dcs.createDebitCard();
        // c.setNif("123");
        return c;
    } // fim create customer//--------------------------//
//	
//

    public Customer editCustomer(Customer customer) {
        // edit customer
        return null;
    }

}
//________________________________________________________________________//
