/**
 * @author Arash
 *
 */

public class Patient extends Person {
	
	//attribute
	protected String identificationNumber;
	
	//constructor
	public Patient() {
		super();
		identificationNumber = "No ID number";
	}

	//overloaded constructor
	public Patient(String name, String identificationNumber) {
		super(name);
		this.identificationNumber = identificationNumber;
	}
	
	/**
	 * @param identificationNumber
	 */
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}
	
	/**
	 * @return identificationNumber
	 */
	public String getIdentificationNumber() {
		return identificationNumber; 
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		return super.toString() + "\n" + 
			   "Patient ID Number: " + identificationNumber;
	}

	/**
	 * @param anotherPatient
	 * @return true if same name and ID Number
	 */
	public boolean isSame(Patient anotherPatient) {
		return (super.isSame(anotherPatient) &&
			    anotherPatient.identificationNumber.equalsIgnoreCase(this.identificationNumber));
	}
}
