// Ternary Operator

 import java.util.*;

 public class Even_odd {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.println("Enter a number : ");

		 int value = sc.nextInt();

		 String status = (value % 2 == 0) ? "Even" : "Odd";

		 System.out.print(status);
	 }
 }
