// Product of a and b by taking input
 import java.util.*;

 public class Product_ab {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number : ");

		int a = sc.nextInt();

		System.out.print("Enter the second number : ");
		
		int b = sc.nextInt();

		long product = a * b;

		System.out.print("Product = "+ product);

	}
 }
