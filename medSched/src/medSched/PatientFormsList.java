package medSched;
import java.util.ArrayList;

public class PatientFormsList {
	private ArrayList<PatientFormAnswers> patientForms = new ArrayList<>();
	private int idNum = 1;
	
	public PatientFormsList() {
		super();
		
	}



	public void addPatientFormAnswers(PatientFormAnswers newAnswers) {
		newAnswers.setId(idNum);
		patientForms.add(newAnswers);
		idNum++;
		HeapSortPatientForm.heapSort(patientForms);
		printPatientForms();
		
	}
	
	

	public ArrayList<PatientFormAnswers> getPatientForms() {
		return patientForms;
	}


	public void setPatientForms(ArrayList<PatientFormAnswers> patientForms) {
		this.patientForms = patientForms;
	}
	
	public void printPatientForms() {
		for(PatientFormAnswers patientFormAnswers:patientForms) {
			patientFormAnswers.printAnswers();
		}
	}
}
