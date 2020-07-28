package pt.rumos.bank;

import java.util.Scanner;

import pt.rumos.bank.administration.RumosADM;
import pt.rumos.bank.atm.RumosATM;

public class RumosDigitalBank {
	private Scanner scanner = new Scanner(System.in);
	private RumosATM atm;
	private RumosADM adm;

	public void run() {
		System.out.println("Bem vindo");
		System.out.println("Selecione sua opção");
		System.out.println("1 - Gestão");
		System.out.println("2 - ATM");
		
		int option = scanner.nextInt();
		
		if (option == 1) {
			adm = new RumosADM();
			adm.run();
			
		} else {
			atm = new RumosATM(adm.getAccounts());
			atm.run();
		}
	}

}
