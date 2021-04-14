package ro.ase.csie.cts.sem8.decorator;

import ro.ase.csie.cts.sem8.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter {

	public DecoratorRanit(ACMECaracterJoc caracter) {
		super(caracter);
	}

	@Override
	public void seDeplaseaza() {
		if(this.caracter.getPuncteViata() < 100 ) {
			System.out.println("Nu se mai poate deplasa. Este ranit critic");
		} else {
			this.caracter.seDeplaseaza();
		}
	}
}
