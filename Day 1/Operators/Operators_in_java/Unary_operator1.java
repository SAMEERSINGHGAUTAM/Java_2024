// Increment Operator

 import java.util.*;

 public class Unary_operator {
	
	 public static void main(String args[]) {
		int a = 10;

		int b = ++a;  // a = 10 -> a = 11 -> b = 11
            	
		int c = a++; // a = 11 -> c = 11 -> a = 12

		System.out.println(b);
		System.out.println(c);
		System.out.print(a);

	 }
 }
