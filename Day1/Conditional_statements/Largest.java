 
 import java.util.*;

 public class Largest  {

	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the first number : ");

		 float val1 = sc.nextFloat();

		 System.out.print("Enter the second number : ");

		 float val2 = sc.nextFloat();

		 if(val1 > val2) {

			 System.out.println(val1 + " is greater");
			 System.out.print("val1 > val2");
		 } 

		 else {

			 System.out.println(val2 + " is greater");
			 System.out.print("val1 < val2");
		 }
	 }

 
 }

// In case if block has single statement to execute then no need of curly braces and same with else block
// if (condition)
// statement ;
// else
// statement;
