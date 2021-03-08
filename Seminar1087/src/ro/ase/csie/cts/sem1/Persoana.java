package ro.ase.csie.cts.sem1;

public class Persoana {
	
	public String firstName;
	public String lastName;
	
	public Persoana(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

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
	
}
