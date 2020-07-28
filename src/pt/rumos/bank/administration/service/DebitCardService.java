package pt.rumos.bank.administration.service;

import pt.rumos.bank.administration.model.DebitCard;
import java.util.Scanner;

public class DebitCardService {

	Scanner KB = new Scanner(System.in);

	public DebitCard createDebitCard() {

		DebitCard dc = new DebitCard();

		System.out.println("Inserir o Número Único: "); // CORRIGIR!!!!!!!!!!
		dc.setUniqueNumber(KB.nextInt());

		System.out.println("Inserir o pin inicial: "); // CORRIGIR!!!!!!!!!!
		dc.setPin(KB.nextInt());

		// Double withdrawn;
		// Boolean isFirstUse;

		// TODO Auto-generated method stub
		return dc;
	}

}
