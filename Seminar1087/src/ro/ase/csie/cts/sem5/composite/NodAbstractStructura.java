package ro.ase.csie.cts.sem5.composite;

public abstract class NodAbstractStructura implements InterfataCaractereNPC {

	public abstract void adaugaNod(NodAbstractStructura nod);
	public abstract void stergereNod(NodAbstractStructura nod);
	public abstract NodAbstractStructura getNod(int index);
}
