package medSched;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PatientForm{
	private PatientFormAnswers answers = new PatientFormAnswers();
	String userResp;
	int userRespInt;
	private Scanner sc = new Scanner(System.in);
	
	//TODO update the needed things later and improve security of function
	public void patientFormQuestions(int userNum) {
			boolean loop;
			switch(userNum){
	        case 1:
	        	System.out.print("Enter your Name: ");
		        answers.setName(sc.nextLine());
	            break;
	
	        case 2:
	        	//Enter user's age
		        System.out.print("\nEnter your Age: ");
		        answers.setUserAge(sc.nextInt()); 
	
		        //Determine if user is one of children/senior
		        if(answers.getUserAge() <= 16){
		            System.out.println("\nYou are one in the children category");
	
		        }else if(answers.getUserAge() >= 60){
		            System.out.println("\nYou are one in the senior category");
	
		        }
	            break;
	
	        case 3:
	        	//Enter user's mobile#
		        System.out.print("\nEnter your Mobile Number: ");
		        answers.setUserMobileNum(sc.nextLong());
	            break;
	        case 4:
	        	//Enter user's emergency contacts
		        System.out.print("\nEnter the person's number we can contact incase of emergency: ");
		        answers.setUserEmergencyNum(sc.nextLong());
	            break;
	
	        case 5:
	        	//Determine if user is part of PWD
		        System.out.print("\nAre you part of PWD?");
		        answers.setUserPWD(yesOrNo());
		        break;
	        case 6:
	            //TODO May need to remove this. Its better to just ask for the service
	        	//the patient requires
	        	
	            //Question #1
	            System.out.println("\nDo you have problems with any of these systems?");
	            System.out.println("====================================================================================");
	            System.out.println("\n1.Gastrointestinal         6.Nervous System            11.Mental");
	            System.out.println("2.Ear/Nose/Throat          7.Genitourinary             12.Endocrine(Glands)");
	            System.out.println("3.Cardiovascular           8.Musculoskeletal           13.Blood/Lymph");
	            System.out.println("4.Respiratory              9.Skin                      14.Allergic/Immunologic");
	            System.out.println("5.Headaches                10.Surgeries");
	            System.out.println("\n====================================================================================");
	            if(yesOrNo()) {
	            	answers.setPatientProblems(enterNumbers(14));
	            }
	            else {
	            };
	           break;
	        
	           //TODO create a set of allergies instead
	        case 7:
	        	//Question #2
	        	sc.nextLine();
		        System.out.print("\n====================================================================================");
		        System.out.println("\n2. Any allergic reactions to medications or other substances?");
		        System.out.print("Enter here: ");
		        answers.setAllergic(yesOrNo());
	            break;
	
	        case 8:
                //Question #3
                System.out.print("\n====================================================================================");
                System.out.println("\nAre you smoking or drinking alcohol?");
                System.out.print("Enter here: ");
                answers.setSmokingDrinking(yesOrNo());
	            break;
	            
	          //TODO create a set of medications instead
	        case 9:
                //Question #4
                System.out.print("\n====================================================================================");
                System.out.println("\nDo you take medications?");
                answers.setTakingMedication(yesOrNo());
                break;
	
	        case 10:
                //Question #5
                System.out.println("\nDo you have family history of any of the following?");
                System.out.println("====================================================================================");
                System.out.println("\n1.Diabetes              3.Glaucoma                 5.High Blood Pressure");
                System.out.println("2.Macular Degen         4.Retinal Detachmt         6.Cataracts");
                System.out.println("\n====================================================================================");

                if(yesOrNo()) {
	            	answers.setFamilyHistory(enterNumbers(6));
	            }
	            else {
	            };
	            break;
	
	        case 11:
	            //Question #6
	            System.out.print("\n====================================================================================");
	            System.out.println("\nAre you in good health?");
	            answers.setInGoodHealth(yesOrNo());
	            break;
	
	        case 12:
                //Question #7
                System.out.print("\n====================================================================================");
                System.out.println("\nHave you been in an accident?");
                answers.setInAccident(yesOrNo());
	            break;
	
	        case 13:
                //Question #8
                System.out.print("\n====================================================================================");
                System.out.println("\nAre you experiencing any pain, please rate it from 1 to 10");
                do {
                	System.out.print("Enter here: ");
                	userRespInt = sc.nextInt();
                	if(userRespInt < 1 || userRespInt > 10) {
                		System.out.println("Only from 1 to 10");
                		}
                	else {
                		answers.setPainScale(userRespInt);
                	}
                	;
                }while(userRespInt < 1 || userRespInt > 10);
                break;
	        case 14:
	        	//TODO create a separate function for switch case get stuff
                //Question #9
                System.out.print("====================================================================================");
                System.out.println("Purpose of Visit");
                System.out.println("A. Check-up");
                System.out.println("B. Surgery");
                System.out.println("C. Therapy");
                System.out.println("D. Others");
                System.out.print("\n====================================================================================");
                do {
                loop = false;
                System.out.print("\nEnter here: ");
                userResp = sc.nextLine();
                switch(userResp.toLowerCase()){
                    case "a":
                    	answers.setPurposeOfVisit("Check-up");
                    	break;
                    case "b":
                    	answers.setPurposeOfVisit("Surgery");
                    	break;
                    case "c":
                    	answers.setPurposeOfVisit("Theraphy");
                    	break;
                    case "d":
                    	answers.setPurposeOfVisit("Others");
                    default:
	                    System.out.print("Only a,b,c,d");
	                    loop = true;
	                    break;
                }
                }while(loop);
                
	            break;
	        //TODO allow to ask for 1st or 2nd dose
	        case 15:
	            //Question #10
	            System.out.print("\n====================================================================================");
	            System.out.println("\nAre you fully vaccinated");
	            answers.setVaccinated(yesOrNo());
	            break;
	        default:
	            System.out.print("0 to 15 only: ");
	            break;
	            
	    }
	}
	
	//TODO check if there are any other points
	public void checkPriority() {
		int points = 0;
		points += (answers.getUserAge() < 18 || answers.getUserAge() >= 60) ? 10 : 0;
		points += (answers.isUserPWD()) ? 10 : 0;
		points += (!answers.getPatientProblems().isEmpty()) ? 10 : 0;
		points += (!answers.getFamilyHistory().isEmpty()) ? 10 : 0;
		//TODO Do we want actually sick people in the hospital
		points += (answers.isInGoodHealth()) ? 10 : 0;
		points += (answers.wasInAccident()) ? 10 : 0;
		points += (answers.getPainScale() > 6) ? 10 : 0;
		points += (answers.isUserPWD()) ? 10 : 0;
		points += (answers.isVaccinated()) ? 10 : 0;
		answers.setPriority(points);
	}
	
	public void scheduleDate() {
		DisplayCalendar();
        System.out.println("Priority:" + Integer.toString(100 - answers.getPriority()));
        System.out.println("\nPlease enter the date that you want to be schedule on. (mm/dd/yyyy)");
        System.out.println("====================================================================================");
        System.out.println("Take Note: Please make sure that you are available on that date you have set.");
        System.out.println("           The System will not automatically re-sched you if failed to do so.");
        System.out.println("====================================================================================");
        
        //TODO add loop for try-catch
        while(true) {
	        try {
	        	System.out.print("Set date here month/day/year: ");
	            String setDate = sc.nextLine();
				answers.setDate(new SimpleDateFormat("MM/dd/yyyy").parse(setDate));
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("Incorrect format");
			}
        }
	}
	
	public boolean yesOrNo() {
		while(true) {
			System.out.println(" Yes or No");
            System.out.print("\nEnter here: ");
        	String userResp = sc.nextLine();
        	if(userResp.toLowerCase().equals("yes")) {return true;}
        	else if(userResp.toLowerCase().equals("no")) {return false;}
        	else {
        		System.out.println("\nYes or No?");
        		System.out.print("Enter here: ");
        		};
		}
	}
	
	//TODO change to Set<String> and make this adaptive in the future
	public Set<Integer> enterNumbers(int max) {
		Set<Integer> intSet = new HashSet<>();
		while(true) {
			System.out.print("\nEnter a number of an answer or enter 0 to stop: ");
            int userRespInt = sc.nextInt();
            if( userRespInt >= 1 && userRespInt <= max){
                intSet.add(userRespInt);
            }
            else if(userRespInt == 0) {
            	return intSet;
            }
            else{
                System.out.println("\n0 to " + Integer.toString(max) + " only");
            }
    	}
	}


	public PatientFormAnswers getAnswers() {
		return answers;
	}


	public void setAnswers(PatientFormAnswers answers) {
		this.answers = answers;
	}
	
	//TODO Create hashmaps for the case so it is easier to 
	//call outside. Add descriptions
	public void patientAnswersEdit() {
		while(true) {
			System.out.println("What do you need to edit. Enter 0 to stop");
			userRespInt = sc.nextInt();
			if (userRespInt == 0) {
				return;
			}
			else {
				patientFormQuestions(userRespInt);
				printAnswers();
			}
		}
	};
	
	private static void DisplayCalendar() {
		// TODO Yeah This is good
		int Y = 2021;    // year
        int startDayOfMonth = 5;
        int spaces = startDayOfMonth;

        // startDayOfMonth

        // months[i] = name of month i
        String[] months = {
                "",                               // leave empty so that we start with months[1] = "January"
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
            };

            // days[i] = number of days in month i
            int[] days = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
            };

            for (int M = 1; M <= 12; M++) {

            // check for leap year
            if  ((((Y % 4 == 0) && (Y % 100 != 0)) ||  (Y % 400 == 0)) && M == 2)
                days[M] = 29;

            
            // print calendar header
            // Display the month and year
            System.out.println("          "+ months[M] + " " + Y);

            // Display the lines
            System.out.println("_____________________________________");
            System.out.println("   Sun  Mon Tue   Wed Thu   Fri  Sat");

            // spaces required
               spaces = (days[M-1] + spaces)%7;
            
            // print the calendar
            for (int i = 0; i < spaces; i++)
                System.out.print("     ");
            for (int i = 1; i <= days[M]; i++) {
                System.out.printf(" %3d ", i);
                if (((i + spaces) % 7 == 0) || (i == days[M])) System.out.println();
            }
            
            System.out.println();
        }
	}
	
	public void printAnswers() {
		answers.printAnswers();
	}
}
