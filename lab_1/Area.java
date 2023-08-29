import java.util.Scanner;

public class Area {
	public static void main(String[] args) {
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		radius = sc.nextInt();
		double areaOfCircle;
		areaOfCircle = Math.PI * radius * radius;
		System.out.println("Area of Circle is " + areaOfCircle);
	}
}