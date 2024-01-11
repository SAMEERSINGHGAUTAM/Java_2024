// Area of a circle
 import java.util.*;

 public class area_circle {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the radius of the circle : ");

		float radius = sc.nextFloat();

		double area = (22.0/7) * radius * radius;

		System.out.print("Area of the circle : "+ area);
	}
 }
