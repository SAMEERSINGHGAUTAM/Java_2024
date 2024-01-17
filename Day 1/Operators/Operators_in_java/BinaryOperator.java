// Binary Operator

 import java.util.*;

 public class BinaryOperator {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the first number : ");

		 float num1 = sc.nextFloat();

		 System.out.print("Enter the second number : ");

		 float num2 = sc.nextFloat();

		 System.out.println(num1 +" + "+ num2 + " = " + (num1+num2));
		 System.out.println(num1 +" - "+ num2 + " = " + (num1-num2));
		 System.out.println(num1 +" * "+ num2 + " = " + (num1*num2));
		 System.out.println(num1 +" / "+ num2 + " = " + (num1/num2));
		// Modulo operation takes place between two integers
		System.out.print("Enter an integer : ");
		
		int num3 = sc.nextInt();

		System.out.print("Enter the second integer : ");

		int num4 = sc.nextInt();

		System.out.print(num3 +" % "+ num4 +" = " + (num3%num4));

	}
 }
