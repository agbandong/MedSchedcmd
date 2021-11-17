package medSched;

import java.util.Scanner;

public class View {
	static PatientView patientView;
	static DoctorView doctorView;
	private static int userRespInt;
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		boolean loop = true;
		System.out.println("====================WELCOME TO MEDSCHED=========================");
		while(loop) {
			System.out.println("Type 0 to exit");
			System.out.println("Type 1 to create a new form");
			System.out.println("Type 2 to view all forms");
			System.out.print("Enter Here: ");
			userRespInt = sc.nextInt();
			System.out.println("");
			switch(userRespInt) {
			case 0:
				loop = false;
				break;
			case 1:
				PatientView.createForm();
				break;
			case 2:
				DoctorView.viewForms();
				break;
			default:
				System.out.println("Illegal input");
			}
		}
	}
}
