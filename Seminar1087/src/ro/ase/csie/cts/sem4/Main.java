package ro.ase.csie.cts.sem4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.sem4.banking.BankAccount;
import ro.ase.csie.cts.sem4.banking.CreditBankAccount;
import ro.ase.csie.cts.sem4.banking.DebitBankAccount;
import ro.ase.csie.cts.sem4.banking.EmailNotificationService;
import ro.ase.csie.cts.sem4.banking.NotificationService;
import ro.ase.csie.cts.sem4.banking.Person;
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
		
	}

}
