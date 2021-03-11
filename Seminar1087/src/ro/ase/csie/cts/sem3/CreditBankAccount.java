package ro.ase.csie.cts.sem3;

public class CreditBankAccount extends BankAccount implements Receivable {

	public CreditBankAccount(String iban, Person accountHolder) {
		this.iban = iban;
		this.accountHolder = accountHolder;
	}

	@Override
	public void deposit(long amount) {
		System.out.println("Adding " + amount + " to " + iban);
		this.balance +=amount;

	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

}
