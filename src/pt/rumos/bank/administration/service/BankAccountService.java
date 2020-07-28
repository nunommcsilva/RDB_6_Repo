package pt.rumos.bank.administration.service;

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

import pt.rumos.bank.administration.RumosADM;
import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.model.Customer;
import java.util.Scanner;
import java.text.DateFormat;

public class BankAccountService {

	private CustomerService customerService = new CustomerService();

	Scanner KB1 = new Scanner(System.in);

	// _______________________________________________________________//

	public BankAccount createBankAccount() {

		BankAccount ba = new BankAccount();

		Integer id = RumosADM.newId();
		ba.setUniqueNumber(id);
		System.out.println("O UniqueNumber é: " + id);

		Customer c = customerService.createCustomer();
		ba.setOwner(c);

		System.out.println("Inserir o saldo: ");
		ba.setBalance(KB1.nextDouble());
		System.out.println("The balance is: " + ba.getBalance());

		return ba;

		// pergunta se quer criar um novo, ou se quer adicionar um já existente;
		// if(novo) { criaNovo(); } else { for (BankAccount bankAccount :
		// RumosADM.accounts) { //verificar se é o owner for (Customer existingCustomer
		// : bankAccount.getNames()) { //verificar se é um dos titulares } } }
		// Double blnc = KB1.nextDouble();
		// ba.setBalance(blnc);
		// ba.setBalance(25.34);
	}
//
//
//
//######################################//

	public void editBankAccount() {
		System.out.println("Insert account number: ");
		int an = KB1.nextInt();
		if (RumosADM.accounts.get(an) == null) {
			System.out.println("Account doesn´t exist ");
		} else {
			System.out.println("Account will be edited ");
			System.out.println(RumosADM.accounts.get(an));
		}
		
		// System.out.println("Insert account number: ");
		// inputInt=scanner.nextInt();
		// System.out.println(KB1.nextInt());
		// System.out.println("Insert account number: ");
		// BankAccount account = KB1.nextLine();
		// System.out.println();
		// perguntar qual é a conta a ser editada
		// receber o numero da conta
		// editar a conta
		// if (account.getUniqueNumber().equals(1)) {
		// edita conta
		// pergunta qual é o customer e enviar para o edit Customer
		// Customer newOwner = customerService.editCustomer(account.getOwner());
		// account.setOwner(newOwner);
		// }
	}
//#################################################//

	public BankAccount findByNif(String nif) {
		// foreach
		// quando encontrar o nif, retornar
		return null;
	}
}
//______________________________________________________________________________//
