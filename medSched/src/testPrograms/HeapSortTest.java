package testPrograms;
import medSched.HeapSort;

public class HeapSortTest{  

	public static void main(String args[]) {
		int arr[] = { 1, 12, 9, 5, 6, 10 };
		
		
		HeapSort.heapSort(arr);

		System.out.println("Sorted array is");
		HeapSort.printArray(arr);
	}
}