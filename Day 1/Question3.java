 import java.util.*;

 public class Question3 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the price of pencil : ");

		float pencil = sc.nextFloat();

		System.out.print("Enter the price of pen : ");

		float pen = sc.nextFloat();

		System.out.print("Enter the price of an eraser : ");

		float eraser = sc.nextFloat();

		float totalCost = 1.18f*(pencil + pen + eraser);

		System.out.print("totol cost with GST : " + totalCost);
	}
 }
