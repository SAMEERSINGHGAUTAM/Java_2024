// Size of all data types
// DataType.SIZE from java.io.* => bits => bits/8 => bytes
 import java.util.*;
 import java.lang.*;
 import java.io.*;
//  import static PrimitiveSizes.*;

 public class Size_of_dataType {

	 public static void main(String args[]) {
		
		 byte a = 123;

		 short b = 798;

		 int c = 679726;

		 float d = 123.45f;

		 long e = 12563276;

		 double f = 56.678965;

		 String g = "DISCORD";

		 boolean h = true;

 		System.out.println("Size of int data type : "+ Integer.SIZE/8);
		System.out.println("Size of byte data type : "+ Byte.SIZE/8);
		System.out.println("Size of short data type : "+ Short.SIZE/8);
		System.out.println("Size of long data type : "+ Long.SIZE/8);
		System.out.println("Size of char data type : "+ Character.SIZE/8);
		System.out.println("Size of float float type : "+ Float.SIZE/8);
		System.out.println("Size of double data type : "+ Double.SIZE/8);
		// System.out.print("Size of boolean data type : "+ boolean.SIZE);


	}

}
