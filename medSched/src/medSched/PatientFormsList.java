package medSched;
import java.util.ArrayList;

public class PatientFormsList {
	private ArrayList<PatientForm> patientForms = new ArrayList<>();
	private int idNum = 1;
	
	
	
	public void addPatientForm(int priority, String name) {
		patientForms.add(new PatientForm(idNum, priority, name));
		HeapSortPatientForm.heapSort(patientForms);
		idNum++;
		printPatientForms();
	}
	
	

	public ArrayList<PatientForm> getPatientForms() {
		return patientForms;
	}


	public void setPatientForms(ArrayList<PatientForm> patientForms) {
		this.patientForms = patientForms;
	}
	
	public void printPatientForms() {
		for(PatientForm patientForm:patientForms) {
			System.out.println("idNumber: "+ Integer.toString(patientForm.getId()) + " name: " +
					patientForm.getName() + " priority number: " + Integer.toString(patientForm.getPriority()));
		}
	}
}
