package ro.ase.csie.cts.sem7.factoryMethod;

import ro.ase.csie.cts.sem7.simpleFactory.FactorySuperErou;
import ro.ase.csie.cts.sem7.simpleFactory.SuperErouAbstract;
import ro.ase.csie.cts.sem7.simpleFactory.TipErou;

public class TestFactoryMethod {

	public static void main(String[] args) {
		
		boolean esteTemaFantasy = true;
		
		FactoryAbstract factoryCaractere = null;
		
		if(esteTemaFantasy) {
			factoryCaractere = new FactoryTemaFantasy();
		}
		else {
			factoryCaractere = new FactoryTemaUniversala();
		}
		
		SuperErouAbstract superCaracter = factoryCaractere.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
		superCaracter = factoryCaractere.getSuperErou(TipErou.MARVEL, "Spiderman");
		superCaracter = factoryCaractere.getSuperErou(TipErou.DC, "Batman");

	}

}
