package pt.rumos.bank.atm;

import java.util.List;
import java.util.Scanner;

import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.model.CreditCard;

public class RumosATM {
	private Scanner scanner = new Scanner(System.in);

	private List<BankAccount> accounts;
	private List<CreditCard> creditCards;
//	private List<DebitCard> debitCards;

	public RumosATM(List<BankAccount> accounts) {
		this.accounts = accounts;
	}

	public void run() {
		System.out.println("Bem vindo ao Rumos ATM");
		System.out.println("Digite o número do seu cartão");
		Integer cardNumber = scanner.nextInt();
		for (CreditCard creditCard : creditCards) {
			if (creditCard.getUniqueNumber() == cardNumber) {
				System.out.println("Digite o pin do seu cartão");
				Integer pin = scanner.nextInt();
				if (creditCard.getPin() == pin) {
					if (creditCard.getIsFirstUse()) {
						/* TODO: troca pass */ }
					System.out.println("Escolha operação");
					System.out.println("1 - Levantar dinheiro");
					System.out.println("2 - Depositar dinheiro");
					Integer option = scanner.nextInt();
					if (option == 1) {
						// TODO levantar dinheiro do PLAFOND
					} else {
						// TODO depositar dinheiro no PLAFOND
					}
				}

			}
		}

	}
}
