package medSched;
import java.util.ArrayList;

public class PatientFormsList {
	private ArrayList<PatientFormAnswers> patientForms = new ArrayList<>();
	private int idNum = 1;
	
	
	
	public void addPatientForm(int priority, String name) {
		patientForms.add(new PatientFormAnswers(idNum, priority, name));
		HeapSortPatientForm.heapSort(patientForms);
		idNum++;
		printPatientForms();
	}
	
	

	public ArrayList<PatientFormAnswers> getPatientForms() {
		return patientForms;
	}


	public void setPatientForms(ArrayList<PatientFormAnswers> patientForms) {
		this.patientForms = patientForms;
	}
	
	public void printPatientForms() {
		for(PatientFormAnswers patientForm:patientForms) {
			System.out.println("idNumber: "+ Integer.toString(patientForm.getId()) + " name: " +
					patientForm.getName() + " priority number: " + Integer.toString(patientForm.getPriority()));
		}
	}
}
