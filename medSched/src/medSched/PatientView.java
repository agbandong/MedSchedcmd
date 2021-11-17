package medSched;

public class PatientView {
	private static PatientFormsList patientFormsList = new PatientFormsList();
	
	public static void createForm() {
		PatientForm patientForm = new PatientForm();
        System.out.println("Registration Form\n");
        for(int i = 1; i <= 15; i++) {
        	patientForm.patientFormQuestions(i);
        }
        System.out.print("Do you need to edit anything. ");
        patientForm.printAnswers();
        if(patientForm.yesOrNo()) {
        	patientForm.patientAnswersEdit();
        }
        patientForm.checkPriority();
        patientForm.scheduleDate();
        patientFormsList.addPatientFormAnswers(patientForm.getAnswers());
        System.out.println("\nYou all set! please come on this Date: "+ patientForm.getAnswers().getSetDate());
	}

	public static PatientFormsList getPatientFormsList() {
		return patientFormsList;
	}

	public static void setPatientFormsList(PatientFormsList patientFormsList) {
		PatientView.patientFormsList = patientFormsList;
	}
}
