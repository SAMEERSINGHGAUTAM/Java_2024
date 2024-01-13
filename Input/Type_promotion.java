// Type- promotion in Java
// To take character as input
// char var_name = object.next().charAt(0); 
// object belongs to scanner class.

 import java.util.*;

 public class Type_promotion {
	 
	 public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character : ");

		char a = sc.next().charAt(0);

		System.out.print("Enter a number : ");

		short b = sc.nextShort();

		System.out.println("sum = " + (a+b));
		System.out.println(a + b);
		System.out.println("Conacatenation : " + a + b); // Type-promotion here does not happen. 
	}
 }
