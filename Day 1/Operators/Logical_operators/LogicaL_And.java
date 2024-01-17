// Logical AND (&&)
// bitwise AND (&)
 
// T && T -> T
// T && F -> F
// F && T -> F
// F && F -> F

 import java.util.*;

 public class Logical_And {

	 public static void main(String args[]) {
		
		 //Scanner sc = new Scanner(System.in);

		 //System.out.print("Enter a number : ");

		 float val1 = 45.89f ;

		 //System.out.print("Enter another number : ");

		 float val2 = 45.67f ;  // 78.89 (double) and 78.89f (float)

		 System.out.println((val1 > val2) && (val1 != val2)); // T && T -> T

		 System.out.println((val1 > val2) && (val1 == val2)); // T && F -> F

		 System.out.println((val1 < val2) && (val1 != val2)); // F && T -> F

		 System.out.println((val1 < val2) && (val1 == val2)); // F && F -> F
	 }
 }
