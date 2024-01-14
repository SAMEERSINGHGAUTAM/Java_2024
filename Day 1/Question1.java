
 import java.util.*;

 public class Question1 {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter first number : ");

		 int A = sc.nextInt();

		 System.out.print("Enter the second number : ");

		 int B = sc.nextInt();

		 System.out.print("Enter the third number : ");

		 int C = sc.nextInt();


		 float Avg = (A+B+C)*1.0f/3; // int * float/int -> float (Type Promotion)

		 System.out.print(Avg);
	 }
 }
