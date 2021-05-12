package ro.ase.csie.cts.sem11.observer;

public class ModulNotificareJucator implements InterfataStatusConexiune {

	@Override
	public void notificarePierdereConexiune() {
		System.out.println("Pop UP! Conexiune internet pierduta!");

	}

}
