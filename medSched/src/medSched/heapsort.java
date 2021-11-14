package medSched;

public class heapsort extends MedSched {  

	public static void main(String args[]) {
		int arr[] = { 1, 12, 9, 5, 6, 10 };

		MedSched doc = new MedSched();
		doc.sort(arr);

		System.out.println("Sorted array is");
		printArray(arr);
	}
}