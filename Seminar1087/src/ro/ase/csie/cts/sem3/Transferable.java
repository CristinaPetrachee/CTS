package ro.ase.csie.cts.sem3;

public interface Transferable {
	
	public void transfer(Receivable destination, long amount) throws InsufficientFundsException;
}
