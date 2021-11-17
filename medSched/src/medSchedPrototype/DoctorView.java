package medSchedPrototype;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


public class DoctorView extends PatientView {

	public static void main(String args[]) {
		String userName = "";
		int pCurrency = 0;
		
		try {
			FileReader patientFile = new FileReader("resources/PatientFile");
			BufferedReader inFile = new BufferedReader(patientFile);
			
			String patientRecord="";
			
			while ((patientRecord=inFile.readLine()) != null) {
			String recArray[] = patientRecord.split("\t");
			userName = recArray[0];
			pCurrency = Integer.parseInt(recArray[1]);
			System.out.print(userName);
			System.out.print(pCurrency);
			}
			
			
			patientFile.close();
			inFile.close();
		}catch (Exception e) {
			System.out.print("Error");
		}
		
	}
}