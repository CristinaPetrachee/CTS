package ro.ase.csie.cts.sem3;

public class DebitBankAccount extends BankAccount implements Payable, Receivable, Transferable {
	
	public DebitBankAccount(String iban, Person accountHolder) {
		this.iban = iban;
		this.accountHolder = accountHolder;
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

	@Override
	public void transfer(Receivable destination, long amount) throws InsufficientFundsException {
		this.withdraw(amount);
		destination.deposit(amount);		
	}

}