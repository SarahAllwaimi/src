package projectJava2;

import java.util.*;
public class LibrarySystem {

	private static int todayD;
	private static int todayM;
	private static int todayY;
	
	
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
         int Choice1;// To open and close the System
		 int Choice2 =0;// To Start the System for Today Date 
		 int Choice3;// To choice any type of Book
		 
		 String CusName; //Customer Name
		 int  CusID; //Customer ID
		 
		 String BoName; //Book name 
		 int BoId; // Book ID
		 int BoPages;
		 
		 String  DateEnd;
 		 String DateStr;
 		 String Date;
		 
		 boolean toBreakLoop=true;// to break first loop 
		 boolean toCheckDate= true;// to check the date is valid 
		 
		 Library ourLibrary =new Library ("","KSU,Riyadh ,Saudi Arabia");
		 
		 
	do {
		System.out.println("Start The System ?");
		System.out.println("1. Yes.");
		System.out.println("2. No");
		Choice1=input.nextInt();
		
		if(Choice1!=2) {
			
			
		// to display the main menu
		do {
			
			//welcoming message 
			System.out.println("\t\t*Hello*\n\tWelcome to our System");
			System.out.print("The Date of Today (YYYY-MM-DD):");
			input.useDelimiter("-");
			todayY=input.nextInt();
			todayM=input.nextInt();
			todayD=input.nextInt();
			
			
			while(toBreakLoop) {
			//menu 
		    System.out.println("-----------------------------------");
			System.out.println("* Choose the required Service:");
			System.out.println("\t1.Buy A Book.");
			System.out.println("\t2.Borrow A Book.");
			System.out.println("\t3.Show all unavailable Books.");
			System.out.println("\t4.Return A Book");
			System.out.println("\t5.Remove A Book");
			System.out.println("\t6Search For A Book");
			System.out.println("\t7.close the system for today.");
			input.useDelimiter("");
			Choice2=input.nextInt();
			
			switch(Choice2){
			    case 1:
			    {
			    	toBreakLoop=true;
			    	while(toBreakLoop) {
			    		System.out.println("-----------------------------------");
			    		System.out.println("Choice Type of The Book:");
				    	System.out.println("1. Arabic Scientific");
				    	System.out.println("2. Arabic Literary");
				    	System.out.println("3. English ");
				    	Choice3=input.nextInt();
				    	input.nextLine(); // to clean the input 
				    	
			    	switch(Choice3) {
			    	case 1:
			    		System.out.println("-----------------------------------");
			    		System.out.println("* Book information:");
			    		System.out.print("Book  Name :");
			    		BoName=input.nextLine();
			    		System.out.print("Book ID:");
			    		BoId=input.nextInt();
			    		System.out.print("Book Number of Pages:");
			    		BoPages=input.nextInt();
				    	input.nextLine();// to clean the input 
				    	
			    		System.out.println("* Customer information:");
			    		System.out.print("Customer Name :");
			    		CusName=input.nextLine();
			    		System.out.print("Customer ID:");
			    		CusID=input.nextInt();
			    	    Date=todayY+"-"+todayM+"-"+todayD;
			    		
			    		toBreakLoop=false;
			    		Scientific B1=new Scientific(BoId ,CusID,CusName,BoName,Date,BoPages);
			    		 ourLibrary.addBook(B1);
						 System.out.println("Arabic Scientific book added successfully!");
						 
			    		//there something missing here we should add it to the array of buying
			    		
			    		break;
			    	case 2:
			    		System.out.println("-----------------------------------");
			    		System.out.println("* Book information:");
			    		System.out.print("Book  Name :");
			    		BoName=input.nextLine();
			    		System.out.print("Book ID:");
			    		BoId=input.nextInt();
			    		System.out.print("Book Number of Pages:");
			    		BoPages=input.nextInt();
				    	input.nextLine();// to clean the input 
				    	
			    		System.out.println("* Customer information:");
			    		System.out.print("Customer Name :");
			    		CusName=input.nextLine();
			    		System.out.print("Customer ID:");
			    		CusID=input.nextInt();
			    		Date=todayY+"-"+todayM+"-"+todayD;
			    		
			    		toBreakLoop=false;
			    		
			    		literary B2=new literary(BoId ,CusID,CusName,BoName,Date,BoPages);
						ourLibrary.addBook(B2);
						System.out.println("Arabic literary book added successfully!");
			    		//there something missing here we should add it to the array of buying
			    		
			    		break;
			    	case 3:
			    		System.out.println("-----------------------------------");
			    		System.out.println("* Book information:");
			    		System.out.print("Book  Name :");
			    		BoName=input.nextLine();
			    		System.out.print("Book ID:");
			    		BoId=input.nextInt();
			    		System.out.print("Book Number of Pages:");
			    		BoPages=input.nextInt();
				    	input.nextLine();// to clean the input 
				    	
			    		System.out.println("* Customer information:");
			    		System.out.print("Customer Name :");
			    		CusName=input.nextLine();
			    		System.out.print("Customer ID:");
			    		CusID=input.nextInt();
			    		Date=todayY+"-"+todayM+"-"+todayD;
			    		
			    		toBreakLoop=false;

						English B3=new English(BoId ,CusID,CusName,BoName,Date,BoPages);
						ourLibrary.addBook(B3);
						System.out.println("English book added successfully!");
			    		
			    		
			    		// here should be opj  eng book and add to the array
			    		break;
			    		
			    	default:
			    			System.out.println("Wrong input ,Try again.");
			    			break;
			    	 }// the end of switch in side case 1
			    	
			       } // the end of the while that in side case 1
			    	
			    }// the end of case 1
			    toBreakLoop=false;
			    break;
			     
			    case 2:
			    {
			    	toBreakLoop=true;
			    	while(toBreakLoop) {
			    		System.out.println("-----------------------------------");
			    		System.out.println("Choice Type of The Book:");
				    	System.out.println("1. Arabic Scientific");
				    	System.out.println("2. Arabic Literary");
				    	System.out.println("3. English ");
				    	Choice3=input.nextInt();
				    	input.nextLine(); // to clean the input 
				    	
				    	switch(Choice3) {
				    	case 1:
				    		System.out.println("-----------------------------------");
				    		System.out.println("* Book information:");
				    		System.out.print("Book  Name :");
				    		BoName=input.nextLine();
				    		System.out.print("Book ID:");
				    		BoId=input.nextInt();
				    		System.out.print("Book Number of Pages:");
				    		BoPages=input.nextInt();
					    	input.nextLine();// to clean the input 
					    	
				    		System.out.println("* Customer information:");
				    		System.out.print("Customer Name :");
				    		CusName=input.nextLine();
				    		System.out.print("Customer ID:");
				    		CusID=input.nextInt();
				    		input.nextLine();// to clean the input 
				    	
				    		
				    		toCheckDate= true;
				    		while (toCheckDate) {
				    
				    		System.out.println("Enter the Date of the Return:");
				    		DateEnd=input.nextLine();
				    		DateStr=todayY+"-"+todayM+"-"+todayD;
				    		
				    		if (CheckDate(DateEnd,DateStr)!=-1) {
				    			toCheckDate=false;
				    		}else 
				    			System.out.println("Wrong Date.");
				    		}// end of the date loop
				    		
							Scientific borrowSci =new Scientific(BoId ,CusID,CusName,BoName,DateStr,DateEnd,BoPages);
							ourLibrary.addBorrow(borrowSci);
				    		//prtint success message
							System.out.println("The Arabic Scientific book has been borrowed successfully!");
				    		// there is some thing miss here  should add it to array 

				    		toBreakLoop=false;
				    		break;
				    	case 2: 
				    		
				    		System.out.println("-----------------------------------");
				    		System.out.println("* Book information:");
				    		System.out.print("Book  Name :");
				    		BoName=input.nextLine();
				    		System.out.print("Book ID:");
				    		BoId=input.nextInt();
				    		System.out.print("Book Number of Pages:");
				    		BoPages=input.nextInt();
					    	input.nextLine();// to clean the input 
					    	
				    		System.out.println("* Customer information:");
				    		System.out.print("Customer Name :");
				    		CusName=input.nextLine();
				    		System.out.print("Customer ID:");
				    		CusID=input.nextInt();
				    		input.nextLine();// to clean the input 
				    		
				    		
				    		toCheckDate= true;
				    		while (toCheckDate) {
				    
				    		System.out.println("Enter the Date of the Return:");
				    		DateEnd=input.nextLine();
				    		DateStr=todayY+"-"+todayM+"-"+todayD;
				    		if (CheckDate(DateEnd,DateStr)!=-1) {
				    			toCheckDate=false;
				    		}else 
				    			System.out.println("Wrong Date.");
				    		}// end of the date loop
				    		
							literary borrowLit =new literary(BoId ,CusID,CusName,BoName,DateStr,DateEnd,BoPages);
							ourLibrary.addBorrow(borrowLit);	
							// prtint success message
							System.out.println("The Arabic Literary book has been borrowed successfully!");
				    		// there is some thing miss here  should add it to array 

				    		
				    		toBreakLoop=false;
				    		break;
				    	case 3:
				    		System.out.println("-----------------------------------");
				    		System.out.println("* Book information:");
				    		System.out.print("Book  Name :");
				    		BoName=input.nextLine();
				    		System.out.print("Book ID:");
				    		BoId=input.nextInt();
				    		System.out.print("Book Number of Pages:");
				    		BoPages=input.nextInt();
					    	input.nextLine();// to clean the input 
					    	
				    		System.out.println("* Customer information:");
				    		System.out.print("Customer Name :");
				    		CusName=input.nextLine();
				    		System.out.print("Customer ID:");
				    		CusID=input.nextInt();
				    		input.nextLine();// to clean the input 
				    		
				    	
				    		toCheckDate= true;
				    		while (toCheckDate) {
				    
				    		System.out.println("Enter the Date of the Return:");
				    		DateEnd=input.nextLine();
				    	    DateStr=todayY+"-"+todayM+"-"+todayD;
				    		if (CheckDate(DateEnd,DateStr)!=-1) {
				    			toCheckDate=false;
				    		}else 
				    			System.out.println("Wrong Date.");
				    		}// end of the date loop
				    		
				    		English borrowEng = new English(BoId ,CusID,CusName,BoName,DateStr,DateEnd,BoPages);
				    		ourLibrary.addBorrow(borrowEng);
				    		// prtint success message
				    		System.out.println("The English book has been borrowed successfully!");
				    		// there is some thing miss here  should add it to array 

				    		toBreakLoop=false;
				    		break;
				    		
				    		default:
				    			System.out.println("Wrong input ,Try again.");
				    			break;
				    	}// end of the switch 
				    	
			    	} // end of the Loop 
			    }// end of the case 
			    case 3:
			    {

		    		toCheckDate= true;
		    		while (toCheckDate) {
		    
			    	System.out.println("Do you want to choose a type of Book?");
			    	System.out.println("1. Arabic Scientific");
			    	System.out.println("2. Arabic Literary");
			    	System.out.println("3. English ");
			    	System.out.println("4.ALL the Books");
			    	Choice3=input.nextInt();
			    	switch(Choice3) {
			    	case 1:
			    		
			    		ourLibrary.ToDisplayScientific(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		toBreakLoop=false;
			    		break;
			    		
			    	case 2:

			    		ourLibrary.ToDisplayLiterary(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		toBreakLoop=false;
			    		break;
			    		
			    	case 3:
			    		ourLibrary.ToDisplayEnglisg(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		toBreakLoop=false;
			    		break;
			    		
			    	case 4:
			    		ourLibrary.ToDisplayLiterary(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		ourLibrary.ToDisplayScientific(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		ourLibrary.ToDisplayEnglisg(ourLibrary.Buy , ourLibrary.Borrow , ourLibrary.getNumBorrowed(),ourLibrary. getNumBooks() );
			    		toBreakLoop=false;
			    		break;
			    		
			    		default:
			    			System.out.println("Wrong input ,Try again.");
			    			break;
			    			
			            	} /// close of the switch 
		    	     	} // close of the loop
			    	} // close  of the case 
			    	break;
			    
			    case 4:
				{
		System.out.println("-----------------------------------");
		System.out.println("***Return A Book***");
		System.out.print("Enter the Book ID:");
		BoId=input.nextInt();
		if(ourLibrary.returnBook(BoId)){ 
		System.out.println("The Book has been returned successfully!");
		}else{ 
			System.out.println("The Book is already in the library or not found.");
		}// close of the if
	}// close  of the case 
 
			    	break;

            	case 5:
					{
			System.out.println("-----------------------------------");
			System.out.println("***Remove A Book***");
			System.out.print("Enter the Book ID:");
			BoId=input.nextInt();
			if(ourLibrary.removbook(BoId)){ 
			System.out.println("The Book has been removed successfully!");
			}else{ 
				System.out.println("The Book is currently borrowed or not found.");
			}// close of the if
		}// close  of the case
					break;

                case 6:
    {
	System.out.println("-----------------------------------");
	System.out.println("***Search For A Book***");
	System.out.print("Enter the Book ID:");
	BoId=input.nextInt();
	Book foundBook = ourLibrary.searchBook(BoId);
	if (foundBook != null) {
		System.out.println("Book found:\n" + foundBook.toString());
	} else {
		System.out.println("Book not found.");
	}
}// close  of the case

                break;


			    case 7:	
				{
					toBreakLoop=false;
				}
			    	break;

			    default:
			    	System.out.println("Wrong input ,Try again.");
	    			break;
				
			     } //the end of the first switch
			
			   }// the end of the while .
			
		     }while(Choice2!=7);
		
		   }// the end of the if statement. 
		
		  System.out.println(" * See you in another Day *");
		  
	   }while(Choice1!=2);
	
	      System.out.println("\tGoodBye.\n\tSystem is closed.");

	}
	
	public  static  boolean CheckDate(String Date) {
		
		        String digits = "";
                //to check it's digits
		        for (int i = 0; i < Date.length(); i++) {

		            if (Character.isDigit(Date.charAt(i))) {

		                digits += Date.charAt(i);

		            }

		        }
                // to check it's 8 digits
		        if (digits.length() < 8) {

		            System.out.println("Invalid date");

		            return false;

		        }
                //to separate the year from the month from the day
		        int year  = Integer.parseInt(digits.substring(0,4));

		        int month = Integer.parseInt(digits.substring(4,6));

		        int day   = Integer.parseInt(digits.substring(6,8));

                // to make sure they are logical numbers for the date 
		        if (year < 1 || month < 1 || month > 12 || day < 1 || day > 31) {

		            System.out.println("Invalid date");

		            return false;

		        }
                 // to make sure it's not in the past 
		        if (year < todayY || 

		           (year == todayY && month < todayM) || 

		           (year == todayY && month == todayM && day < todayD)) {

		            System.out.println("Past date , Invalid date ");

		            return false;

		        } else if (year == todayY && month == todayM && day == todayD) {

		            System.out.println("Today date");

		            return true;

		        } else {

		            System.out.println("Future date");

		            return true;

		        }
	}
	
      public  static int CheckDate(String start, String end) {

		           
                    // to check it's vaild date.
		            if (!CheckDate(start) || !CheckDate(end)) {

		                return -1; 

		            }



		            // Start Date 
		            String sDigits = "";

		            for (int i = 0; i < start.length(); i++) {

		                if (Character.isDigit(start.charAt(i))) sDigits += start.charAt(i);

		            }

		            int sy = Integer.parseInt(sDigits.substring(0,4));

		            int sm = Integer.parseInt(sDigits.substring(4,6));

		            int sd = Integer.parseInt(sDigits.substring(6,8));



                    // End Date 
		            String eDigits = "";

		            for (int i = 0; i < end.length(); i++) {

		                if (Character.isDigit(end.charAt(i))) eDigits += end.charAt(i);

		            }

		            int ey = Integer.parseInt(eDigits.substring(0,4));

		            int em = Integer.parseInt(eDigits.substring(4,6));

		            int ed = Integer.parseInt(eDigits.substring(6,8));

                    


		            int startDays = sy * 365 + sm * 30 + sd;

		            int endDays   = ey * 365 + em * 30 + ed;



		            return endDays - startDays;

		        }
      
    
      
      
    
     

		        
		        
	}

