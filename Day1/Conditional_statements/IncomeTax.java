// Income < 5L -> 0 % tax
// Income between 5L - 10L -> 20 % tax
// Income > 10L -> 30 % tax

 import java.util.*;

 public class IncomeTax {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter your Income : ");

		 float income = sc.nextFloat();
		 
		 float tax ;

		 int a = 100000;

		 if (income < 5.0f * a) {
		  
			 tax = 0.0f;

		 }

		 else if (income >= 5.0f * a && income <= 10.0f * a) {

			 tax = 0.2f * income;
			 
		 }

		 else {

			 tax = 0.3f * income ;
			 
		 }

		 System.out.print("Tax : " + tax);
	 }
 }
