package ro.ase.csie.cts.sem2.solid;

public class BankAccount {
	private String iban;
	private long balance;

	private Person accountHolder;

	public BankAccount(String iban, Person person) {
		this.iban = iban;
		this.accountHolder = person;
		balance = 0;
	}

	public void withdraw(long amount) throws InsufficientFundsException {
		if (amount > balance)
			throw new InsufficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

	public void deposit(long amount) {
		System.out.println("Adding " + amount + " to " + iban);
		balance += amount;
	}

	public String getIban() {
		return iban;
	}

	public long getBalance() {
		return balance;
	}

	public Person getAccountHolder() {
		return accountHolder;
	}

}