package testPrograms;
import medSched.PatientFormsList;
import medSchedPrototype.HeapSort;

import java.util.ArrayList;


public class HeapSortTest{  

	public static void main(String args[]) {
		
		int[] arr = { 1, 12, 9, 5, 6, 10 };
		
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
	}
}