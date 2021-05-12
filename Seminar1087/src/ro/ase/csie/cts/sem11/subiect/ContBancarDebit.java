package ro.ase.csie.cts.sem11.subiect;

public class ContBancarDebit implements ContBancar {

	double balanta;
	String iban;
	
	public ContBancarDebit(double balanta, String iban) {
		super();
		this.balanta = balanta;
		this.iban = iban;
	}

	@Override
	public void transfer(ContBancar destinatie, double suma) {
		destinatie.depune(suma);
		this.balanta -= suma;
	}

	@Override
	public void depune(double suma) {
		this.balanta += suma;
		
	}

}
