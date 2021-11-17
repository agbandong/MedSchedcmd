package medSched;
import java.util.ArrayList;

public class HeapSortPatientForm {

	private static void heapify(ArrayList<PatientFormAnswers> arr, int n, int i) {
	// Find largest among root, left child and right child
	int largest = i;
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	
	if (l < n && arr.get(l).getPriority() > arr.get(largest).getPriority())
	    largest = l;
	
	if (r < n && arr.get(r).getPriority() > arr.get(largest).getPriority())
	    largest = r;
	
	// Swap and continue heapifying if root is not largest
	if (largest != i) {
	    PatientFormAnswers swap = arr.get(i);
	    arr.set(i, arr.get(largest));
	    arr.set(largest, swap);
	
	    heapify(arr, n, largest);
	    }
	}

	public static void heapSort(ArrayList<PatientFormAnswers> arr) {
		// TODO Auto-generated method stub
		int n = arr.size();
	      
	    // Build max heap
	    for (int i = n / 2 - 1; i >= 0; i--) {
	        heapify(arr, n, i);
	    }
	
	    // Heap sort
	    for (int i = n - 1; i >= 0; i--) {
	        PatientFormAnswers temp = arr.get(0);
	        arr.set(0, arr.get(i));
	        arr.set(i, temp);
	
	        // Heapify root element
	        heapify(arr, i, 0);
	    }
	}

	// Function to print an array
	    public static void printArrayList(ArrayList<PatientFormAnswers> arr) {
	        int n = arr.size();
	        for (int i = 0; i < n; ++i)
	            System.out.print(arr.get(i).getPriority() + " ");
	            System.out.println();
	}

}
