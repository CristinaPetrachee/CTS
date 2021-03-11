package ro.ase.csie.cts.sem3;

public class DebitBankAccount implements Payable, Receivable {
	private String iban;
	private long balance;

	private Person accountHolder;

	public DebitBankAccount(String iban, Person person) {
		this.iban = iban;
		this.accountHolder = person;
		balance = 0;
	}

	@Override
	public void withdraw(long amount) throws InsufficientFundsException {
		if (amount > balance)
			throw new InsufficientFundsException("Insuficient funds " + balance);
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

	@Override
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