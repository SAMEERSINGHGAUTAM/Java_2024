// long, float and double dataType

 import java.util.*;

 public class Type_promotion3 {

	public static void main(String args[]) {
		
		long a = 78945;

		float b = 123.45f;

		double e = 123.55;

 //		long c = a + b; Error - possible lossy conversion from float to long
 
		float c = a + b; // long + float = float

		double g = a + e; // long + double = double

		double h = b + e; // float + double = double

		double i = a + b + e; // long + float + double = double

		System.out.println(c+"\t"+g+"\t"+h+"\t"+i);
	}
 }
