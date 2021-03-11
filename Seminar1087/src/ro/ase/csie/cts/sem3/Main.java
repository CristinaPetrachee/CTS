package ro.ase.csie.cts.sem3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws InsufficientFundsException {
		
		Map<Person, Receivable> employees = new HashMap<>();
		
		Person p1 = new Person("Chuck Norris");
		CreditBankAccount b1 = new CreditBankAccount("RFZ123123123", p1);
		
		Person p2 = new Person("Arnold");
		DebitBankAccount b2 = new FeeBankAccount("INGB123123123", p2);
		
		Person p3 = new Person("Van Damme");
		DebitBankAccount b3 = new DebitBankAccount("BT123123123", p3);
		
		employees.put(p1, b1);
		employees.put(p2, b2);
		employees.put(p3, b3);
		
		for(Receivable a : employees.values()) {
			a.deposit(1000);
		}
		
		Map<Person, Payable> union = new HashMap<>();
		
		union.put(p2, b2);
		union.put(p3, b3);
		
		
		for(Payable a : union.values()) {
			try {
				a.withdraw(10);
			} catch (InsufficientFundsException ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		System.out.println("\n\n");
		
		try {
			b2.transfer(b3, 200);
		} catch (InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}

	}

}