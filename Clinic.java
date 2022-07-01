package Question3;
/**
 * @author Arash
 *
 */
public class Clinic { 
	
	public static void main(String[] args) {
		
		Patient patient1 = new Patient("Karen", "K9384");
		Patient patient2 = new Patient("Jonah", "J5876");
		
		Doctor doctorJoe = new Doctor("Dr.Joe", "Foot", 50);
		Doctor doctorPaula = new Doctor("Dr.Paula", "Heart", 75);
		
		//uses mutators and accessors  
		Billing bill1 = new Billing();
		bill1.setDoctor(doctorJoe);
		bill1.setPatient(patient1);
		System.out.println(bill1.toString());
		System.out.println();
		
		//uses constructor
		Billing bill2 = new Billing(doctorPaula, patient2);
		System.out.println(bill2.toString());
		
		//prints sum total of doctor visit
		double totalVisitFee = bill1.getDoctor().visitFee + bill2.getDoctor().visitFee;
		System.out.println("\nTotal income from clients: $" + totalVisitFee );
		
		// testing the equal methods		
		Patient testPatient1 = new Patient("Karen", "K9384");
		Doctor  testDoctorJoe = new Doctor("Dr.Joe", "Foot", 50);
		
		System.out.println( "\nIs the same Patient: (patient1 and patientTest) " +
				testPatient1.isSame(patient1) + 
				"\nIs the same Doctor: (doctorJoe and doctorTest)" +
				testDoctorJoe.isSame(doctorJoe)
				);
	}

}
