// = -> (Equal to) 
// A = B 
// Means value of B is assigned to A (Right to left)
// Suppose,
// A = 10 and B = 5
// A = B then 
// A = 5 and B = 5
//
// A = A + 10 
// It can also be written as 
// A += 10 (execution is fast)
//
// B = B - 5
// It can also be written as 
// B -= 5 (execution is fast)
//
// A = A * 5
// It can also be written as 
// A *= 5;
//
// B = B / 5
// It can also be written as
// B /= 5
//
// A = A % 5
// It can also be written as
// A %= 5
 
 import java.util.*;

 public class Assignment_operator {

	 public static void main(String args[]) {
		int A = 5;
		A += 10;
		System.out.println(A);

		int B = 15;
		B /= 5 ;
		System.out.println(B);

		int C = 20;
		C -= 7;
		System.out.println(C);

		int D = 67;
		D %= 5;
		System.out.println(D);

		int E = 20;
		E *= 5;
		System.out.println(E);
	 }
 }
