package pt.rumos.bank.administration.service;

import pt.rumos.bank.administration.model.CreditCard;
import java.util.Scanner;

public class CreditCardService {

	Scanner KB = new Scanner(System.in);

	public CreditCard createCreditCard() {

		CreditCard cc = new CreditCard();

		System.out.println("Inserir o Número Único: "); // CORRIGIR!!!!!!!!!!
		cc.setUniqueNumber(KB.nextInt());

		System.out.println("Inserir o pin inicial: "); // CORRIGIR!!!!!!!!!!
		cc.setPin(KB.nextInt());

		System.out.println("Inserir o plafond: ");
		cc.setPlafond(KB.nextDouble());

		// Integer timesWithdrawnToday;
		// Double balance;
		// Double plafond;
		// Boolean isFirstUse;

		// TODO Auto-generated method stub
		return cc;
	}

}
