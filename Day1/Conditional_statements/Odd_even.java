
// Odd - n%2=1
// Even - n%2=0

 import java.util.*;

 public class Odd_even {
	
	 public static void main(String args[]) {
		
		 Scanner sc = new Scanner(System.in);

		 System.out.print("Enter the value : ");

		 int t =  sc.nextInt();

		 if(t % 2 == 0) {

			 System.out.print("Even");
		
		 }

		 else {

			 System.out.print("Odd");

		 }
	 }

}

/* Number is divisible by 2 or 
 Multiple of 2 then
 it is even
 */
