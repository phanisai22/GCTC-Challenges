//package com.EMICalculator;
//
//import java.text.NumberFormat;
//
//public class MainClass {
//    public static void main(String args[]){
//		
//	int principal=(int)readValues("Principal: ",1000,200000);
//	float annualInterest=(float)readValues("annualInterest: ",3,30);
//	byte years=(byte)readValues("Time period in Years : ",1,30);
//	double remainingBalance=0.0;
//
//      printEmi(principal, annualInterest, years);
//		
//		printRemainingBalance(principal, annualInterest, years);
//		 // System.out.println("start");
//		  // printNumber(4);
//		  // System.out.println("end");
//  }
//	
//	public static void printNumber(int n) {
//		   for(byte i=0;i<=n;i+=1) {
//			   System.out.println(i);
//		   }
//	}
//	
//	
//	private static void printRemainingBalance(int principal, float annualInterest, byte years) {
//		double remainingBalance;
//		System.out.println();
//		System.out.println("Payment Schedule is ");
//		System.out.println("____________________");
//		for(int month=1;month<=years*MONTHS_IN_YEAR;month++)
//		{
//	    remainingBalance=calculateBalance(principal,annualInterest ,years ,month);
//		System.out.println( NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(remainingBalance));
//		
//		}
//	}
//       // create a class called Mortgage report
//	private static void printEmi(int principal, float annualInterest, byte years) {
//		double emi= emiCalculator(principal,annualInterest,years);     
//		String result= NumberFormat.getCurrencyInstance(new Locale ("em","In")).format(emi);
//		System.out.println(); 
//		System.out.println("EMI");
//		System.out.println("________");
//		System.out.println("Your Monthly EMI is " + result);
//	}
//	
//	   
////create a console class 
//	static double readValues(String promnt ,int min,int max) {
//	    	double value=0.0;
//	    	Scanner scanner = new Scanner(System.in); 
//	    	
//	    	while(true)
//			{
//			System.out.print(promnt);
//			
//			 value= scanner.nextDouble();
//			if(value>=min && value <=max)
//				break;
//			System.out.println( "Enter range between" +min+"and"+max);
//			}// `
//	    	return value;
//	    	
//	    }// end of read values 
//            // Create a class CalulateMortgage
//	
//	static double calculateBalance(int principal, float annualInterest,byte years,int numberOfPaymentsMade) {
//		
//		   	
//  	float  monthlyInterestRate= annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
//  	short numberOfPayments = (short)(years*MONTHS_IN_YEAR);
//				
//		double balance=principal*(Math.pow(1+monthlyInterestRate,numberOfPayments)
//				-Math.pow(1+monthlyInterestRate,numberOfPaymentsMade))
//				/ (Math.pow(1+monthlyInterestRate, numberOfPayments)-1);
//		return balance;
//	}
//	
//   
//	static double emiCalculator(int principal, float annualInterest,byte years ) {
//      	        	
//      	float  monthlyInterestRate= annualInterest/PERCENTAGE/MONTHS_IN_YEAR;
//      	short numberOfPayments = (short)(years*MONTHS_IN_YEAR);
//      	double emi= principal * (monthlyInterestRate* Math.pow(1+monthlyInterestRate ,numberOfPayments))
//      			   /(Math.pow(1+monthlyInterestRate ,numberOfPayments)-1);
//      	return emi;
//      }// end of emiCalculator
//}
