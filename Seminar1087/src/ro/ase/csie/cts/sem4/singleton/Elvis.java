package ro.ase.csie.cts.sem4.singleton;

public class Elvis {

	private static Elvis theTrueElvis = new Elvis();

	private Elvis() {

	}

	public static Elvis getInstance() {
		if (theTrueElvis == null)
			theTrueElvis = new Elvis();

		return theTrueElvis;
	}

	public void sing() {
		System.out.println("Elvis is singing");
	}

}
