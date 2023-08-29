import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of array");
		int n = sc.nextInt();

		int myArray[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.println("enter Array element");
			myArray[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {

			System.out.println(myArray[i]);

		}
	}
}