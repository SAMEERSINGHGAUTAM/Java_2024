// Sum of two numbers by taking input
 
 import java.util.*;

 public class input_sumab {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");

		double value1 = sc.nextDouble();

		System.out.print("Enter Second number : ");

		double value2 = sc.nextDouble();

		double sum = value1 + value2;

		System.out.println("Sum of " + value1 +"+" + value2 + " =" + sum);
	}
 }
