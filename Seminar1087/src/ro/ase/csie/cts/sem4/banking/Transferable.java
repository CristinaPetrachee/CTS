package ro.ase.csie.cts.sem4.banking;

public interface Transferable {
	
	public void transfer(Receivable destination, long amount) throws InsufficientFundsException;
}
