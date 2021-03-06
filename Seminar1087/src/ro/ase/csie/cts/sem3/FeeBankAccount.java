package ro.ase.csie.cts.sem3;

public class FeeBankAccount extends DebitBankAccount {
	
	private long fee = 2;

	public FeeBankAccount(NotificationService ns, String iban, Person person) {
		super(ns, iban, person);
	}
	
	@Override
	public void withdraw(long amount) throws InsufficientFundsException {
		System.out.println("Adding " + fee + " fee to withdrawal");
		super.withdraw(amount + fee);
	}

}
