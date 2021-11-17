package medSched;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


//TODO include FileManager later
public class FileManager {
	String FileName = "PatientFile";
	public void writeFile() {	
	    try {
	    	FileWriter patientFile = new FileWriter(FileName,true);
	    	PrintWriter outFile = new PrintWriter(patientFile);
	    	outFile.println();
	    	patientFile.close();
	    	outFile.close();
	    }catch (Exception e) {
	    	System.out.print("Error");
	    }
	}
	public void readFile() {
		
	}
	public void printFile() {
		try {
			FileReader patientFile = new FileReader("resources/PatientFile");
			BufferedReader inFile = new BufferedReader(patientFile);
			
			String patientRecord="";
			
			while ((patientRecord=inFile.readLine()) != null) {
			String recArray[] = patientRecord.split("\t");
			String userName = recArray[0];
			int pCurrency = Integer.parseInt(recArray[1]);
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
