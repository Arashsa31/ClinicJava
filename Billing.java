/**
 * @author Arash
 *
 */
public class Billing {

	//attributes
	private Doctor doctor;
	private Patient patient;

	//constructor
	public Billing() {

	}
	
	//overloaded constructor
	public Billing(Doctor doctor, Patient patient) {
		this.doctor = doctor;
		this.patient = patient;
	}

	/**
	 * @param doctor
	 */
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	/**
	 * @param patient
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	/**
	 * @return doctor
	 */
	public Doctor getDoctor() {
		return doctor;
	}

	/**
	 * @return patient
	 */
	public Patient getPatient() {
		return patient;
	}
	
	/**
	 * @return overrides toString
	 */
	public String toString() {
		return "Doctor " + doctor.toString() + 
		   	   "\nPatient " +  patient.toString();
	}
}
