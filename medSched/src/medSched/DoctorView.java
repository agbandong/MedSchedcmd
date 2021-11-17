package medSched;

public class DoctorView {
	private static PatientFormsList patientFormsList = PatientView.getPatientFormsList();
	public static void viewForms() {
		for(PatientFormAnswers answers: patientFormsList.getPatientForms()) {
			System.out.println("Patient Form id: " + answers.getId());
			answers.printAnswers();
	        System.out.println("\n Appointment Date: "+ answers.getSetDate());
		}
	}
}
