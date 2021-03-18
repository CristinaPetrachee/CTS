package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.Bank;
import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.InsufficientFundsException;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;
import ro.ase.csie.cts.sem4.banking.Person.NotificationType;
import ro.ase.csie.cts.sem4.banking.SMSNotificationService;
import ro.ase.csie.cts.sem4.singleton.Elvis;
import ro.ase.csie.cts.sem4.singleton.ElvisV2;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();

		Person p3 = new Person("Van Damme");
		p3.setEmail("van@damme.com");
		p3.setMobile("+4765223087");
		
		//static factory method
		CreditBankAccount b = CreditBankAccount.createCreditBankAccountWithBalance(emailService, "INGB2345245", p3, 50);
		
		CreditBankAccount b1 = CreditBankAccount.createCreditBankAccount(emailService, "BRD2345245", p3);

		BigInteger bi = new BigInteger(24, 11, new Random());
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());
		
		Boolean value = Boolean.valueOf(false);
		
		b.deposit(50);
		System.out.println(b.toString());
		
		System.out.println("\n");
		Elvis elvis = Elvis.getInstance();
		elvis.sing();
		
		ElvisV2 elvisV2 = ElvisV2.INSTANCE;
		elvisV2.sing();
		System.out.println("\n");
		
		Bank bank = Bank.getInstance();
		
		Person adult = new Person("Van Damme");
		adult.setEmail("van@damme.com");
		adult.setMobile("+4765223087");
		adult.setAge(30);
		adult.setNotificationType(NotificationType.EMAIL);
		
		Person child = new Person("Junior");
		child.setEmail("junior@damme.com");
		child.setMobile("+4734567729");
		child.setAge(14);
		child.setNotificationType(NotificationType.SMS);
				
		DebitBankAccount debit1 = bank.openDebitAccount(adult);
		DebitBankAccount debit2 = bank.openDebitAccount(child);

		
		debit1.deposit(20);
		try {
			debit1.withdraw(15);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		debit2.deposit(5);
		try {
			debit2.withdraw(3);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(debit1);
		System.out.println(debit2);
	}

}
