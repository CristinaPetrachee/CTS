package ro.ase.csie.cts.sem11.subiect;

public class AdapterContToAccount implements BankAccount {
	
	ContBancar cont;

	public AdapterContToAccount(ContBancar cont) {
		super();
		this.cont = cont;
	}

	@Override
	public void accountTransfer(BankAccount account, double amount) {
		ContBancarDebit contDebit = (ContBancarDebit) conversie(account);
		cont.transfer(contDebit, amount);
	};
	
	private ContBancar conversie(BankAccount account) {
		DebitAccount debit = (DebitAccount) account;
		ContBancar cont = new ContBancarDebit(debit.value, debit.id+"");
		return cont;
	}
}
