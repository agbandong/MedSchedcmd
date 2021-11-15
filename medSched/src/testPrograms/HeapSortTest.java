package testPrograms;
import medSched.HeapSort;
import medSched.PatientFormsList;

import java.util.ArrayList;


public class HeapSortTest{  

	public static void main(String args[]) {
		
		int[] arr = { 1, 12, 9, 5, 6, 10 };
		PatientFormsList patientFormsList = new PatientFormsList();
		patientFormsList.addPatientForm(2, "Adrian Bandong");
		patientFormsList.addPatientForm(1, "Churchhill Capagngan");
		patientFormsList.addPatientForm(4, "Jan Navarette");
		patientFormsList.addPatientForm(2, "John Manahan");
		patientFormsList.addPatientForm(3, "Zhong Lee");
		patientFormsList.addPatientForm(1, "Taylor Swift");
		patientFormsList.addPatientForm(2, "Kurt Cadenas");
		
		//For testing how to convert from array to ArrayList to back to array
		ArrayList<Integer> arrList = new ArrayList<Integer>();
			for(int i:arr) {
		arrList.add(i);
		}
//		int[] arrConvert = arrList.stream().mapToInt(i -> i).toArray();
		
		HeapSortArrList.heapSort(arrList);
		HeapSort.heapSort(arr);

		System.out.println("Sorted array is");
		
		HeapSort.printArray(arr);
		HeapSortArrList.printArrayList(arrList);
		patientFormsList.printPatientForms();
	}
}