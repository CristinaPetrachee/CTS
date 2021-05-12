package ro.ase.csie.cts.sem11.observer;

public class TestObserver {

	public static void main(String[] args) {
		ModulConexiuneInternet modulConexiuneInternet = new ModulConexiuneInternet();
		ModulAutoSalvare modulSalvare = new ModulAutoSalvare();
		ModulNotificareJucator modulNotificari = new ModulNotificareJucator();
		
		modulConexiuneInternet.registerModul(modulNotificari);
		modulConexiuneInternet.registerModul(modulSalvare);

		modulConexiuneInternet.pierdereConexiune();
		
		modulConexiuneInternet.unregisterModul(modulSalvare);
		
		modulConexiuneInternet.pierdereConexiune();
	}

}
