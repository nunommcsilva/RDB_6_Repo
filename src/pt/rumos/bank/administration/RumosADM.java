package pt.rumos.bank.administration;

import java.util.*;
import java.time.*;
import java.text.*;
import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import pt.rumos.App;
import pt.rumos.bank.administration.model.BankAccount;
import pt.rumos.bank.administration.service.BankAccountService;
//

public class RumosADM {

	private static Integer accountId = 1;
	private Scanner scanner = new Scanner(System.in);
	private String input;
	private int inputInt;

	public static List<BankAccount> accounts = new ArrayList<BankAccount>();

	private BankAccountService accountService = new BankAccountService();

//_______________________________________________________________________//

	public void run() {

		System.out.println("Bem vindo a gestão de contas");
		System.out.println("Escolha a sua opção");

		System.out.println("1 - Criar conta");
		System.out.println("2 - Editar conta");
		System.out.println("3 - Exibir conta por nif");
		System.out.println("4 - Listar todas as contas");
		System.out.println("5 - Apagar conta");
		System.out.println("6 - Voltar ao início");

		int option = scanner.nextInt();
		// -----------------------------------//
		switch (option) {

		case 1:
			BankAccount bankAccount = accountService.createBankAccount();
			accounts.add(bankAccount);
			System.out.println("Conta adicionada.");
			break;

		case 2:
			if (accounts.isEmpty()) {
				System.out.println("\nAinda não foi criada nenhuma conta.");
				break;
			} else {
				accountService.editBankAccount();
			}
			break;
					// System.out.println("Insert account number: ");
					// inputInt = scanner.nextInt();
					// if (accounts.get(inputInt) == null) {
					// System.out.println("Account doesn´t exist ");
					// } else
					// System.out.println(accounts.get(inputInt));

		case 3:
			System.out.println("Digite o nif do cliente a buscar");
			input = scanner.next();
			BankAccount printAccount = accountService.findByNif(input);
			break;

		case 4:
			if (accounts.isEmpty()) {
				System.out.println("\nAinda não foi criada nenhuma conta.");
			}
			System.out.println(accounts + "\n");
			break;

		case 5:
			System.out.println("Digite o nif do cliente a remover");
			input = scanner.next();
			BankAccount deleteAccount = accountService.findByNif(input);
			accounts.remove(deleteAccount);
			break;

		case 6:
			App.main(null);
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		run();
	}
//--------------------------------------------------------------------------//

	public static Integer newId() {
		return RumosADM.accountId++;
	}

	public List<BankAccount> getAccounts() {
		return accounts;
	}
}
//___________________________________________________________________________//
//