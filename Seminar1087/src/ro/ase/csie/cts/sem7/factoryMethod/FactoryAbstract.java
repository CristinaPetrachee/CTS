package ro.ase.csie.cts.sem7.factoryMethod;

import ro.ase.csie.cts.sem7.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.sem7.simpleFactory.TipErou;

public abstract class FactoryAbstract {
	
	public abstract SuperErouAbstract getSuperErou(TipErou tip, String nume);
}
