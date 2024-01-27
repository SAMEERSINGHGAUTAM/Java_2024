// Logical OR (||)
// T || T -> T
// T || F -> T
// F || T -> T
// F || F -> F

 import java.util.*;

 public class Logical_OR {
	public static void main(String args[]) {
		
		int val1 = 5 ;
		 
		int val2 = 6 ;

		System.out.println((val1 < val2) || (val1 != val2)); // T || T -> T

		System.out.println((val1 < val2) || (val1 == val2)); // T || F -> T

		System.out.println((val1 > val2) || (val1 != val2)); // F || T -> T

		System.out.print((val1 > val2) || (val1 == val2)); // F || F -> F
	}
 }
