// nextBoolean() -> Store the boolean values as input.
 
 import java.util.*;

 public class Store_boolean {
	
	 public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Are you a student : ");

		boolean tr = sc.nextBoolean(); // boolean data-type -> true or false
		
		// Do not give as input as 1 or 0. Only true or false

		System.out.print(tr);
	}
 }
