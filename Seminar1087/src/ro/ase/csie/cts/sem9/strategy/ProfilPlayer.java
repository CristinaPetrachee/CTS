package ro.ase.csie.cts.sem9.strategy;

public class ProfilPlayer {

	String username;
	double playTime;
	int nrNiveluri;
	
	InterfataBonus strategieBonus = null;
	
	public ProfilPlayer(String username, double playTime, int nrNiveluri) {
		super();
		this.username = username;
		this.playTime = playTime;
		this.nrNiveluri = nrNiveluri;
	}

	public void setStrategieBonus(InterfataBonus strategieBonus) {
		this.strategieBonus = strategieBonus;
	}

	public void getBonus() {
		if(this.strategieBonus != null) {
			int puncteBonus = this.strategieBonus.getPuncteBonus(this);
			System.out.println("Ai primit puncte bonus = " + puncteBonus);
		}
		else
			throw new UnsupportedOperationException();
	}
}
