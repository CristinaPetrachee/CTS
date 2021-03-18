package ro.ase.csie.cts.sem4.banking;

public interface Payable {
	void withdraw(long amount) throws InsufficientFundsException;
}
