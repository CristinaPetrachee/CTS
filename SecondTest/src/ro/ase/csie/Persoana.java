package ro.ase.csie;

public class Persoana {
	
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Persoana [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public Persoana(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
}
