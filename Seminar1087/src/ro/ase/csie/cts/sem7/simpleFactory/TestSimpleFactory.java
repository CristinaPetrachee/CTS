package ro.ase.csie.cts.sem7.simpleFactory;

public class TestSimpleFactory {

	public static void main(String[] args) {

		SuperErouAbstract supererou = new CaracterDisney("Mickey Mouse", 100, false);
		supererou = new CaracterMarvel("Spiderman", 150, 50);
		supererou = new CaracterDCComics("Batman", 150);

		boolean selectieTemaUniversala = true;

		SuperErouAbstract superCaracter;

		if (selectieTemaUniversala) {
			superCaracter = FactorySuperErou.getSuperErou(TipErou.DISNEY, "Mickey Mouse");
			superCaracter = FactorySuperErou.getSuperErou(TipErou.MARVEL, "Spiderman");
			superCaracter = FactorySuperErou.getSuperErou(TipErou.DC, "Batman");
		} else {
			// folosesti caractere din tema fantasy a jocului
		}
	}

}
