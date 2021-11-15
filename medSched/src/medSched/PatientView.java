package medSched;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Date;
import java.util.*;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


public class PatientView {

		public static void main(String[] args)throws Exception {
	        Scanner sc = new Scanner(System.in);

	        ArrayList<Integer> lineCur = new ArrayList<Integer>();
	        ArrayList<String> lineName = new ArrayList<String>();

	        String error = "Error: Invalid input";
	        String userName = "";
	        String userResp = "";
	        String userResp1 = "";
	        String userResp2 = "";
	        String userResp3 = "";
	        String userResp4 = "";
	        String userResp5 = "";
	        String userAns1 = "";
	        String userAns2 = "";
	        String userAns3 = "";
	        String userAns5 = "";
	        String userAns6 = "";
	        String userAns8 = "";
	        String userAns9 = "";
	        String pagod = "";
	        String setDate = "";

	        Date date = new Date();

	        long userMob = 0;
	        long userEme = 0;
	        int pCurrency = 0;
	        int userAge = 0;
	        int userAns = 0;
	        int userAns4 = 0;
	        int userAns7 = 0;
	        int userResp6 = 0;
	        int p = 0;
	        int p1 = 0;
	        int p2 = 0;
	        int p3 = 0;
	        int p4 = 0;
	        int p5 = 0;
	        int p6 = 0;
	        int p7 = 0;
	        int p8 = 0;
	        int p9 = 0;
	        int tp = 0;
	        int confirm = 1;
	        
	        HashSet<Integer> listAns = new HashSet<Integer>();
	        HashSet<Integer> listAns1 = new HashSet<Integer>();

	        //Title page
	        System.out.println("====================WELCOME TO MEDSCHED=========================");
	        System.out.println("Registration Form\n");
	        //Enter user's name
	        System.out.print("Enter your Name: ");
	        userName = sc.nextLine();

	        //Enter user's age
	        System.out.print("\nEnter your Age: ");
	        userAge = sc.nextInt();

	        //Determine if user is one of children/senior
	        if(userAge <= 16){
	            System.out.println("\nYou are one in the children category");

	        }else if(userAge >= 60){
	            System.out.println("\nYou are one in the senior category");

	        }

	        //Enter user's mobile#
	        System.out.print("\nEnter your Mobile Number: ");
	        userMob = sc.nextLong();

	        //Enter user's emergency contacts
	        System.out.print("\nEnter the person's number we can contact incase of emergency: ");
	        userEme = sc.nextLong();
	            
	        //Determine if user is part of PWD
	        System.out.print("\nAre you part of PWD? Yes or No?");
	        System.out.print("\nEnter here: ");
	        userResp = sc.nextLine();
	        
	        do{
	            userResp = sc.nextLine();

	            if(userResp.equals("Yes") || userResp.equals("yes") || userResp.equals("YES")){

	            }else if(userResp.equals("No") || userResp.equals("no") || userResp.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            }

	        }while(!(userResp.equals("Yes") || userResp.equals("yes") || userResp.equals("YES") || userResp.equals("No") || userResp.equals("no") || userResp.equals("NO")));
	        
	        //Set Appointment
	        DisplayCalendar();
	        System.out.println("\nPlease enter the date that you want to be schedule on. (mm/dd/yyyy)");
	        System.out.println("====================================================================================");
	        System.out.println("Take Note: Please make sure that you are available on that date you have set.");
	        System.out.println("           The System will not automatically re-sched you if failed to do so.");
	        System.out.println("====================================================================================");
	        System.out.print("Set date here: ");
	        setDate = sc.nextLine();
	        
	        //Question #1
	        System.out.println("\n1. Do you have problems with any of these systems? Yes or No");
	        System.out.println("====================================================================================");
	        System.out.println("\n1.Gastrointestinal         6.Nervous System            11.Mental");
	        System.out.println("2.Ear/Nose/Throat          7.Genitourinary             12.Endocrine(Glands)");
	        System.out.println("3.Cardiovascular           8.Musculoskeletal           13.Blood/Lymph");
	        System.out.println("4.Respiratory              9.Skin                      14.Allergic/Immunologic");
	        System.out.println("5.Headaches                10.Surgeries");
	        System.out.println("\n====================================================================================");
	        System.out.print("\nEnter here: ");
	        do{
	            userResp1 = sc.nextLine();

	            if(userResp1.equals("Yes") || userResp1.equals("yes") || userResp1.equals("YES")){
	                System.out.print("\nEnter number here: ");

	                do{
	                    userAns = sc.nextInt();
	                    if(userAns <= 14 && userAns >= 1){
	                        System.out.print("\nIf done, please press 0");
	                        listAns.add(userAns);
	                        System.out.print("\nEnter number here again: ");
	            
	                    }
	                    if(userAns <=-1 || userAns >= 15){
	                        System.out.println("\n"+error);
	                        System.out.print("Try Again: ");
	        
	                    }
	                }while(userAns != 0);
	                break;

	            }else if(userResp1.equals("No") || userResp1.equals("no") || userResp1.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            }

	        }while(!(userResp1.equals("No") || userResp1.equals("no") || userResp1.equals("NO")) || userAns != 0);
	        

	        //Question #2
            sc.nextLine();
	        System.out.print("\n====================================================================================");
	        System.out.println("\n2. Any allergic reactions to medications or other substances? Yes or No");
	        System.out.print("Enter here: ");
	        
	        
	        userAns1 = sc.nextLine();
	        if(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES")){
	        	while (!(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES") || userAns1.equals("No") || userAns1.equals("no") || userAns1.equals("NO"))) {
		        	System.out.println("\n"+error);
		        	System.out.print("Try Again: ");
		        	userAns1 = sc.nextLine();
	        	}
		            if(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES")){

		            }else if(userAns1.equals("No") || userAns1.equals("no") || userAns1.equals("NO")){
            }
	        }
		    else if(userAns1.equals("No") || userAns1.equals("no") || userAns1.equals("NO")){

            }

	        

	        //Question #3
	        System.out.print("\n====================================================================================");
	        System.out.println("\n3. Are you smoking or drinking alcohol? Yes or No");
	        System.out.print("Enter here: ");

	        do{
	            userAns2 = sc.nextLine();

	            if(userAns2.equals("Yes") || userAns2.equals("yes") || userAns2.equals("YES")){

	            }else if(userAns2.equals("No") || userAns2.equals("no") || userAns2.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            } 

	        }while(!(userAns2.equals("Yes") || userAns2.equals("yes") || userAns2.equals("YES") || userAns2.equals("No") || userAns2.equals("no") || userAns2.equals("NO")));

	        //Question #4
	        System.out.print("\n====================================================================================");
	        System.out.println("\n4. Do you take medications? Yes or No");
	        System.out.print("Enter here: ");

	        do{
	            userAns3 = sc.nextLine();

	            if(userAns3.equals("Yes") || userAns3.equals("yes") || userAns3.equals("YES")){

	            }else if(userAns3.equals("No") || userAns3.equals("no") || userAns3.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");
	                
	            }    

	        }while(!(userAns3.equals("Yes") || userAns3.equals("yes") || userAns3.equals("YES") || userAns3.equals("No") || userAns3.equals("no") || userAns3.equals("NO")));

	        //Question #5
	        System.out.println("\n5. Do you have family history of any of the following? Yes or No");
	        System.out.println("====================================================================================");
	        System.out.println("\n1.Diabetes              3.Glaucoma                 5.High Blood Pressure");
	        System.out.println("2.Macular Degen         4.Retinal Detachmt         6.Cataracts");
	        System.out.println("\n====================================================================================");
	        System.out.print("\nEnter here: ");

	        do{
	            userResp2 = sc.nextLine();

	            if(userResp2.equals("Yes") || userResp2.equals("yes") || userResp2.equals("YES")){
	                System.out.print("\nEnter number here: ");

	                do{
	                    userAns4 = sc.nextInt();
	                    if(userAns4 <= 6 && userAns4 >= 1){
	                        System.out.print("\nIf done press 0");
	                        listAns1.add(userAns4);
	                        System.out.print("\nEnter number here again: ");

	                    }
	                    if(userAns4 <=-1 || userAns4 >= 7){
	                        System.out.println("\n"+error);
	                        System.out.print("Try Again: ");
	                
	                    }
	                }while(userAns4 != 0);
	                break;

	            }else if(userResp2.equals("No") || userResp2.equals("no") || userResp2.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            }

	        }while(!(userResp2.equals("No") || userResp2.equals("no") || userResp2.equals("NO")) || userAns4 != 0);

	        //Question #6
	        sc.nextLine();
	        System.out.print("\n====================================================================================");
	        System.out.println("\n6. Are you in good health? Yes or No");
	        System.out.print("Enter here: ");
    
	        do{
	            userAns5 = sc.nextLine();

	            if(userAns5.equals("Yes") || userAns5.equals("yes") || userAns5.equals("YES")){
	            	
	            }else if(userAns5.equals("No") || userAns5.equals("no") || userAns5.equals("NO")){
	            	
	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            }   

	        }while(!(userAns5.equals("Yes") || userAns5.equals("yes") || userAns5.equals("YES") || userAns5.equals("No") || userAns5.equals("no") || userAns5.equals("NO")));

	        //Question #7
	        System.out.print("\n====================================================================================");
	        System.out.println("\n7. Have you been in an accident? Yes or No");
	        System.out.print("Enter here: ");

	        do{
	            userAns6 = sc.nextLine();

	            if(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES")){
	                System.out.print("\nWhat Date did the accident happened: ");
	                userResp3 = sc.nextLine();
	                System.out.print("\nCan you state the injury occur: ");
	                userResp4 = sc.nextLine();

	            }else if(userAns6.equals("No") || userAns6.equals("no") || userAns6.equals("NO")){

	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");

	            }   

	        }while(!(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES") || userAns6.equals("No") || userAns6.equals("no") || userAns6.equals("NO")));
	            
	        //Question #8
	        System.out.print("\n====================================================================================");
	        System.out.println("\n8. If you experiencing any pain, please rate it from 1 to 10");
	        System.out.print("Enter here: ");

	        do{
	            userAns7 = sc.nextInt();
	            if(userAns7 <= 10 && userAns7 >= 1){
	                
	            }
	            if(userAns7 <= 0 || userAns7 >= 11){
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");
	                    
	            }
	        }while(!(userAns7 >= 1 && userAns7 <= 10));    

	        //Question #9
	        sc.nextLine();
	        System.out.print("\n====================================================================================");
	        System.out.println("\n9. Purpose of Visit");
	        System.out.println("\nA. Check-up");
	        System.out.println("B. Surgery");
	        System.out.println("C. Therapy");
	        System.out.println("D. Others");
	        System.out.print("\n====================================================================================");
	        System.out.print("\nEnter here: ");
	            
	        do{
	            userAns8 = sc.nextLine();

	            switch(userAns8){
	                case "a":
	                break;
	                case "A":
	                break;
	                case "b":
	                break;
	                case "B":
	                break;
	                case "c":
	                break;
	                case "C":
	                break;
	                case "d":
	                break;
	                case "D":
	                break;
	                default:
	                    System.out.println("\n"+error);
	                    System.out.print("Try Again: ");
	                    break;

	            }
	        }while(!(userAns8.equals("A") || userAns8.equals("B") || userAns8.equals("C") || userAns8.equals("D") || userAns8.equals("a") || userAns8.equals("b") || userAns8.equals("c") || userAns8.equals("d")));

	        //Question #10
	        System.out.print("\n====================================================================================");
	        System.out.println("\n10. What is your Vaccination Status");
	        System.out.println("\nA. Unvaccinated");
	        System.out.println("B. 1st Dose");
	        System.out.println("C. 2nd Dose");
	        System.out.print("\n====================================================================================");
	        System.out.print("\nEnter here: ");

	        do{
	            userAns9 = sc.nextLine();
	            switch(userAns9){
	                case "a":
	                break;
	                case "A":
	                break;
	                case "b":
	                break;
	                case "B":
	                break;
	                case "c":
	                break;
	                case "C":
	                break;
	                default:
	                    System.out.println("\n"+error);
	                    System.out.print("Try Again: ");
	                    break;

	            }
	        }while(!(userAns9.equals("A") || userAns9.equals("B") || userAns9.equals("C") || userAns9.equals("a") || userAns9.equals("b") || userAns9.equals("c")));

	        do{
	            //User info clarificationn
	            System.out.println("\n\n====================================================================================");
	            System.out.println("Please clarify the information bellow before you continue");
	            System.out.println("\nName: "+userName);
	            System.out.println("Age: "+userAge);
	            System.out.println("Mobile #: "+userMob);
	            System.out.println("Emergency Contact #: "+userEme);
	            System.out.println("Are you part of PWD?: "+userResp);
	            System.out.println("\nDo you have problems with any of these systems?");
	            System.out.println("====================================================================================");
	            System.out.println("\n1.Gastrointestinal         6.Nervous System            11.Mental");
	            System.out.println("2.Ear/Nose/Throat          7.Genitourinary             12.Endocrine(Glands)");
	            System.out.println("3.Cardiovascular           8.Musculoskeletal           13.Blood/Lymph");
	            System.out.println("4.Respiratory              9.Skin                        14.Allergic/Immunologic");
	            System.out.println("5.Headaches                10.Surgeries");
	            System.out.println("\n====================================================================================");
	            System.out.println("Answer: "+userResp1);

	            if(userResp1.equals("Yes") || userResp1.equals("yes") || userResp1.equals("YES")){
	                System.out.println("\nList: "+listAns);
	            }

	            System.out.println("\n====================================================================================");
	            System.out.println("\nAny allergic reactions to medications or other substances?");
	            System.out.println("Answer: "+userAns1);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nAre you smoking or drinking alcohol?");
	            System.out.println("Answer: "+userAns2);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nDo you take medications?");
	            System.out.println("Answer: "+userAns3);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nDo you have family history of any of the following?");
	            System.out.println("====================================================================================");
	            System.out.println("\n1.Diabetes              3.Glaucoma                 5.High Blood Pressure");
	            System.out.println("2.Macular Degen         4.Retinal Detachmt         6.Cataracts");
	            System.out.println("\n====================================================================================");
	            System.out.println("Answer: "+userResp2);

	            if(userResp2.equals("Yes") || userResp2.equals("yes") || userResp2.equals("YES")){
	                System.out.println("\nList: "+listAns1);
	            }

	            System.out.println("\n====================================================================================");
	            System.out.println("\nAre you in good health?");
	            System.out.println("Answer: "+userAns5);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nHave you been in an accident?");
	            System.out.println("Answer: "+userAns6);

	            if(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES")){
	                System.out.println("\nDate: "+userResp3);
	                System.out.println("State of injurie: "+userResp4);
	            }

	            System.out.println("\n====================================================================================");
	            System.out.println("\nIf you experiencing any pain, please rate it from 1 to 10");
	            System.out.println("Answer: "+userAns7);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nPurpose of Visit");
	            System.out.println("\nA. Check-up");
	            System.out.println("B. Surgery");
	            System.out.println("C. Therapy");
	            System.out.println("D. Others");
	            System.out.println("\n====================================================================================");
	            System.out.println("Answer: "+userAns8);
	            System.out.println("\n====================================================================================");
	            System.out.println("\nWhat is your Vaccination Status");
	            System.out.println("\nA. Unvaccinated");
	            System.out.println("B. 1st Dose");
	            System.out.println("C. 2nd Dose");
	            System.out.println("\n====================================================================================");
	            System.out.println("Answer: "+userAns9);
	            System.out.println("\nAre all Information Correct? Yes or No");
	            System.out.print("Enter here: ");
	            userResp5 = sc.nextLine();

	            if(userResp5.equals("No") || userResp5.equals("no") || userResp5.equals("NO")){
	                System.out.println("\nWhich part do you wish to change?");
	                System.out.println("====================================================================================");
	                System.out.println("\n1. Name");
	                System.out.println("2. Age");
	                System.out.println("3. Mobile #");
	                System.out.println("4. Emergency #");
	                System.out.println("5. Part of PWD");
	                System.out.println("6. List of Symptoms");
	                System.out.println("7. Allergies on Medication");
	                System.out.println("8. Smoking or Alcohol");
	                System.out.println("9. Medication Take");
	                System.out.println("10. Family's Medical History");
	                System.out.println("11. Good Health");
	                System.out.println("12. Accident Occure");
	                System.out.println("13. Rate of Pain");
	                System.out.println("14. Purpose of Visit");
	                System.out.println("15. Vaccination");
	                System.out.println("\n====================================================================================");
	                System.out.print("Enter number here: ");
	                userResp6 = sc.nextInt();

	                switch(userResp6){
	                    case 1:
	                        do{
	                            //Re-enter user's name
	                            System.out.print("Enter Change Name here: ");
	                            userName = sc.nextLine();
	                            System.out.println("Do you wish to change your name to this? Yes or No");
	                            pagod = sc.nextLine();
	                                
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 2:
	                        do{
	                            //Re-enter user's age
	                            System.out.print("\nEnter Change Age here: ");
	                            userAge = sc.nextInt();

	                            //Determine if user is one of children/senior
	                            if(userAge <= 16){
	                                System.out.println("\nYou are one in the children category");

	                            }else if(userAge >= 60){
	                                System.out.println("\nYou are one in the senior category");

	                            }

	                            System.out.println("Do you wish to change your age to this? Yes or No");
	                            pagod = sc.nextLine();
	                                
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 3:
	                        do{
	                            //Re-enter user's mobile#
	                            System.out.print("\nEnter your Mobile Number: ");
	                            userMob = sc.nextLong();
	                            System.out.println("Do you wish to change your mobile number to this? Yes or No");
	                            pagod = sc.nextLine();
	                            
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;
	                        
	                    case 4:
	                        do{
	                            //Re-enter user's emergency contacts
	                            System.out.print("\nEnter the person's number we can contact incase of emergency: ");
	                            userEme = sc.nextLong();
	                            System.out.println("Do you wish to change your emergency contact to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 5:
	                        do{
	                            //Change the answer in part of PWD
	                            System.out.print("\nAre you part of PWD? Yes or No?");
	                            System.out.print("\nEnter here: ");

	                            do{
	                                userResp = sc.nextLine();

	                                if(userResp.equals("Yes") || userResp.equals("yes") || userResp.equals("YES")){

	                                }else if(userResp.equals("No") || userResp.equals("no") || userResp.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }

	                            }while(!(userResp.equals("Yes") || userResp.equals("yes") || userResp.equals("YES") || userResp.equals("No") || userResp.equals("no") || userResp.equals("NO")));

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 6:
	                        do{
	                            //Re-answer Question #1
	                            System.out.println("Do you have problems with any of these systems? Yes or No");
	                            System.out.println("====================================================================================");
	                            System.out.println("\n1.Gastrointestinal         6.Nervous System            11.Mental");
	                            System.out.println("2.Ear/Nose/Throat          7.Genitourinary             12.Endocrine(Glands)");
	                            System.out.println("3.Cardiovascular           8.Musculoskeletal           13.Blood/Lymph");
	                            System.out.println("4.Respiratory              9.Skin                      14.Allergic/Immunologic");
	                            System.out.println("5.Headaches                10.Surgeries");
	                            System.out.println("\n====================================================================================");
	                            System.out.print("\nEnter here: ");


	                            do{
	                                userResp1 = sc.nextLine();

	                                if(userResp1.equals("Yes") || userResp1.equals("yes") || userResp1.equals("YES")){
	                                    System.out.print("\nEnter number here: ");

	                                    do{
	                                        userAns = sc.nextInt();
	                                        if(userAns <= 14 && userAns >= 1){
	                                            System.out.print("\nIf done, please press 0");
	                                            listAns.add(userAns);
	                                            System.out.print("\nEnter number here again: ");
	                                
	                                        }
	                                        if(userAns <=-1 || userAns >= 15){
	                                            System.out.println("\n"+error);
	                                            System.out.print("Try Again: ");
	                            
	                                        }
	                                    }while(userAns != 0);
	                                    break;

	                                }else if(userResp1.equals("No") || userResp1.equals("no") || userResp1.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }

	                            }while(!(userResp1.equals("No") || userResp1.equals("no") || userResp1.equals("NO")) || userAns != 0);

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 7:
	                        do{
	                            //Re-answer Question #2
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nAny allergic reactions to medications or other substances? Yes or No");
	                            System.out.print("Enter here: ");  

	                            do{
	                                userAns1 = sc.nextLine();

	                                if(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES")){

	                                }else if(userAns1.equals("No") || userAns1.equals("no") || userAns1.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }   

	                            }while(!(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES") || userAns1.equals("No") || userAns1.equals("no") || userAns1.equals("NO")));
	                            
	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 8:
	                        do{
	                            //Re-Answer Question #3
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nAre you smoking or drinking alcohol? Yes or No");
	                            System.out.print("Enter here: ");

	                            do{
	                                userAns2 = sc.nextLine();

	                                if(userAns2.equals("Yes") || userAns2.equals("yes") || userAns2.equals("YES")){

	                                }else if(userAns2.equals("No") || userAns2.equals("no") || userAns2.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                } 

	                            }while(!(userAns2.equals("Yes") || userAns2.equals("yes") || userAns2.equals("YES") || userAns2.equals("No") || userAns2.equals("no") || userAns2.equals("NO")));
	                            
	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 9:
	                        do{
	                            //Re-answer Question #4
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nDo you take medications? Yes or No");
	                            System.out.print("Enter here: ");

	                            do{
	                                userAns3 = sc.nextLine();

	                                if(userAns3.equals("Yes") || userAns3.equals("yes") || userAns3.equals("YES")){

	                                }else if(userAns3.equals("No") || userAns3.equals("no") || userAns3.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");
	                                    
	                                }    

	                            }while(!(userAns3.equals("Yes") || userAns3.equals("yes") || userAns3.equals("YES") || userAns3.equals("No") || userAns3.equals("no") || userAns3.equals("NO")));

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 10:
	                        do{
	                            //Re-answer Question #5
	                            System.out.println("\nDo you have family history of any of the following? Yes or No");
	                            System.out.println("====================================================================================");
	                            System.out.println("\n1.Diabetes              3.Glaucoma                 5.High Blood Pressure");
	                            System.out.println("2.Macular Degen         4.Retinal Detachmt         6.Cataracts");
	                            System.out.println("\n====================================================================================");
	                            System.out.print("\nEnter here: ");

	                            do{
	                                userResp2 = sc.nextLine();

	                                if(userResp2.equals("Yes") || userResp2.equals("yes") || userResp2.equals("YES")){
	                                    System.out.print("\nEnter number here: ");

	                                    do{
	                                        userAns4 = sc.nextInt();
	                                        if(userAns4 <= 6 && userAns4 >= 1){
	                                            System.out.print("\nIf done press 0");
	                                            listAns1.add(userAns4);
	                                            System.out.print("\nEnter number here again: ");

	                                        }
	                                        if(userAns4 <=-1 || userAns4 >= 7){
	                                            System.out.println("\n"+error);
	                                            System.out.print("Try Again: ");
	                                    
	                                        }
	                                    }while(userAns4 != 0);
	                                    break;

	                                }else if(userResp2.equals("No") || userResp2.equals("no") || userResp2.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }

	                            }while(!(userResp2.equals("No") || userResp2.equals("no") || userResp2.equals("NO")) || userAns4 != 0);

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 11:
	                        do{
	                            //Re-answer Question #6
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nAre you in good health? Yes or No");
	                            System.out.print("Enter here: ");

	                            do{
	                                userAns5 = sc.nextLine();

	                                if(userAns5.equals("Yes") || userAns5.equals("yes") || userAns5.equals("YES")){

	                                }else if(userAns5.equals("No") || userAns5.equals("no") || userAns5.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }   

	                            }while(!(userAns5.equals("Yes") || userAns5.equals("yes") || userAns5.equals("YES") || userAns5.equals("No") || userAns5.equals("no") || userAns5.equals("NO")));

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 12:
	                        do{
	                            //Re-answer Question #7
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nHave you been in an accident? Yes or No");
	                            System.out.print("Enter here: ");

	                            do{
	                                userAns6 = sc.nextLine();

	                                if(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES")){
	                                    System.out.print("\nWhat Date did the accident happened: ");
	                                    userResp3 = sc.nextLine();
	                                    System.out.print("\nCan you state the injury occur: ");
	                                    userResp4 = sc.nextLine();

	                                }else if(userAns6.equals("No") || userAns6.equals("no") || userAns6.equals("NO")){

	                                }else{
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");

	                                }   

	                            }while(!(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES") || userAns6.equals("No") || userAns6.equals("no") || userAns6.equals("NO")));
	                            
	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 13:
	                        do{
	                            //Re-answer Question #8
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nIf you experiencing any pain, please rate it from 1 to 10");
	                            System.out.print("Enter here: ");

	                            do{
	                                userAns7 = sc.nextInt();
	                                if(userAns7 <= 10 && userAns7 >= 1){
	                                    
	                                }
	                                if(userAns7 <= 0 || userAns7 >= 11){
	                                    System.out.println("\n"+error);
	                                    System.out.print("Try Again: ");
	                                        
	                                }
	                            }while(!(userAns7 >= 1 && userAns7 <= 10));
	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 14:
	                        do{
	                            //Re-answer Question #9
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nPurpose of Visit");
	                            System.out.println("\nA. Check-up");
	                            System.out.println("B. Surgery");
	                            System.out.println("C. Therapy");
	                            System.out.println("D. Others");
	                            System.out.print("\n====================================================================================");
	                            System.out.print("\nEnter here: ");
	                                
	                            do{
	                                userAns8 = sc.nextLine();

	                                switch(userAns8){
	                                    case "a":
	                                    break;
	                                    case "A":
	                                    break;
	                                    case "b":
	                                    break;
	                                    case "B":
	                                    break;
	                                    case "c":
	                                    break;
	                                    case "C":
	                                    break;
	                                    case "d":
	                                    break;
	                                    case "D":
	                                    break;
	                                    default:
	                                        System.out.println("\n"+error);
	                                        System.out.print("Try Again: ");
	                                        break;

	                                }
	                            }while(!(userAns8.equals("A") || userAns8.equals("B") || userAns8.equals("C") || userAns8.equals("D") || userAns8.equals("a") || userAns8.equals("b") || userAns8.equals("c") || userAns8.equals("d")));

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    case 15:
	                        do{
	                            //Re-answer Question #10
	                            System.out.print("\n====================================================================================");
	                            System.out.println("\nWhat is your Vaccination Status");
	                            System.out.println("\nA. Unvaccinated");
	                            System.out.println("B. 1st Dose");
	                            System.out.println("C. 2nd Dose");
	                            System.out.print("\n====================================================================================");
	                            System.out.print("\nEnter here: ");

	                            do{
	                                userAns9 = sc.nextLine();
	                                switch(userAns9){
	                                    case "a":
	                                    break;
	                                    case "A":
	                                    break;
	                                    case "b":
	                                    break;
	                                    case "B":
	                                    break;
	                                    case "c":
	                                    break;
	                                    case "C":
	                                    break;
	                                    default:
	                                        System.out.println("\n"+error);
	                                        System.out.print("Try Again: ");
	                                        break;

	                                }
	                            }while(!(userAns9.equals("A") || userAns9.equals("B") || userAns9.equals("C") || userAns9.equals("a") || userAns9.equals("b") || userAns9.equals("c")));

	                            System.out.println("Do you wish to change your answer to this? Yes or No");
	                            pagod = sc.nextLine();
	                        
	                            if(pagod.equals("No") || pagod.equals("no") || pagod.equals("NO")){
	                            }else if(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")){
	                            }else{
	                                System.out.println("\n"+error);
	                                System.out.print("Try Again: ");                            

	                            }
	                        }while(!(pagod.equals("Yes") || pagod.equals("yes") || pagod.equals("YES")));
	                        break;

	                    default:
	                        System.out.println("\n"+error);
	                        System.out.print("Try Again: ");
	                        break;
	        
	                }

	            }else if(userResp5.equals("Yes") || userResp5.equals("yes") || userResp5.equals("YES")){
	            
	            }else{
	                System.out.println("\n"+error);
	                System.out.print("Try Again: ");
	            }
	        }while(!(userResp5.equals("Yes") || userResp5.equals("yes") || userResp5.equals("YES")));

	        //Scoring
	        //Q1
	        if(userResp1.equals("Yes") || userResp1.equals("yes") || userResp1.equals("YES")){
	            p = 10;
	        }

	        //Q2
	        if(userAns1.equals("Yes") || userAns1.equals("yes") || userAns1.equals("YES")){
	            p1 = 10;
	        }

	        //Q3
	        if(userAns2.equals("Yes") || userAns2.equals("yes") || userAns2.equals("YES")){
	            p2 = 10;
	        }

	        //Q4
	        if(userAns3.equals("Yes") || userAns3.equals("yes") || userAns3.equals("YES")){
	            p3 = 10;
	        }

	        //Q5
	        if(userResp2.equals("Yes") || userResp2.equals("yes") || userResp2.equals("YES")){
	            p4 = 10;
	        }

	        //Q6
	        if(userAns5.equals("Yes") || userAns5.equals("yes") || userAns5.equals("YES")){
	            p5 = 10;
	        }

	        //Q7
	        if(userAns6.equals("Yes") || userAns6.equals("yes") || userAns6.equals("YES")){
	            p6 = 10;
	        }

	        //Q8
	        p7 = userAns7;

	        //Q9
	        if(userAns8.equals("A") || userAns8.equals("a")){
	            p8 = 3;
	        }else if(userAns8.equals("B") || userAns8.equals("b")){
	            p8 = 10;
	        }else if(userAns8.equals("C") || userAns8.equals("c")){
	            p8 = 8;
	        }else if(userAns8.equals("D") || userAns8.equals("d")){
	            p8 = 5;
	        }

	        //Q10
	        if(userAns9.equals("A") || userAns9.equals("a")){
	            p9 = 0;
	        }else if(userAns9.equals("B") || userAns9.equals("b")){
	            p9 = 5;
	        }else if(userAns9.equals("C") || userAns9.equals("c")){
	            p9 = 10;
	        }

	        tp = p+p1+p2+p3+p4+p5+p6+p7+p8+p9;

	        if(tp <= 100 && tp >= 75){
	            pCurrency = 1;
	        }else if(tp <= 74 && tp >= 50){
	            pCurrency = 2;
	        }else if(tp <= 49 && tp >= 25){
	            pCurrency = 3;
	        }else{
	            pCurrency = 4;
	        }

	        lineCur.add(pCurrency);
	        lineName.add(userName);
	        

	        date = new SimpleDateFormat("MM/dd/yyyy").parse(setDate);
	        
	        System.out.println("Points:"+lineCur);
	        System.out.println("\nYou all set! please come on this Date: "+date);
	        
	        String FileName = "PatientFile";
	        try {
	        	FileWriter patientFile = new FileWriter(FileName,true);
	        	PrintWriter outFile = new PrintWriter(patientFile);
	        	outFile.println(userName + "\t" + pCurrency);
	        	patientFile.close();
	        	outFile.close();
	        }catch (Exception e) {
	        	System.out.print("Error");
	        }
	    
	}
		
		
		private static void DisplayCalendar() {
			// TODO Auto-generated method stub
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
}