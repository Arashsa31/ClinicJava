/**
 * @author Arash
 *
 */

public class Doctor extends Person{
	
	//attribute
	protected String specialty;
	protected double visitFee;
	
	//constructor
	public Doctor() {
		super();
		specialty = "No specialty";
		visitFee = 0.0;
	}

	//overloaded constructor
	public Doctor(String name, String specialty, double visitFee) {
		super(name);
		this.specialty = specialty;
		this.visitFee = visitFee;
	}
	
	/**
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	/**
	 * @return identificationNumber
	 */
	public String getSpecialty() {
		return specialty; 
	}
	
	/**
	 * @param specialty
	 */
	public void setVisitFee(double visitFee) {
		this.visitFee = visitFee;
	}
	
	/**
	 * @return identificationNumber
	 */
	public double getVisitFee() {
		return visitFee; 
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		return  super.toString() 		  + "\n" + 
				"Specialty: " + specialty + "\n" + 
				"Office Visit Fee: $" + visitFee;
	}

	/**
	 * @param anotherDoctor
	 * @return true if same name and specialty
	 */
	public boolean isSame(Doctor anotherDoctor) {
		return (super.isSame(anotherDoctor) &&
				anotherDoctor.specialty.equalsIgnoreCase(this.specialty));
	}

}
