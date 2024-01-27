
 import java.util.*;

 public class Larget_ofThree {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the first number : ");

		 float q = sc.nextFloat();

		 System.out.print("Enter the second number : ");

		 float r = sc.nextFloat();

		 System.out.print("Enter the third number : ");

		 float s = sc.nextFloat();

		 if(q > r && q > s) {

			 System.out.print(q + " is largest");

		 } 

		 else if (r > s) {

			 System.out.print(r + " is largest");

		 }

		 else {

			 System.out.print(s + " is largest");
		
		 }

	 }
 }
