// Teenager and Adult

 import java.util.*;

 public class Teenager_adult {
		
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the age : ");

		 int age = sc.nextInt();

		 if ( age >= 13 && age < 18 ) {

			 System.out.print("Teenager");

		 } 

		 else if ( age >= 18) {

			 System.out.print("Adult");

		 } 

		 else {

			 System.out.print("Child");

		 }
	 }
 }
