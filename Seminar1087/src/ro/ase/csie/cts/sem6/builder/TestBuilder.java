package ro.ase.csie.cts.sem6.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//1. construiesti obiectul
		SuperErou superErou = new SuperErou();
		
		//2. initializarea atributelor
		superErou.nume = "Superman";
		
		SuperErou superErou2 = new SuperErou("Batman", 10, false, false, new Arma(), null, null, null);

	}

}
