import java.util.Scanner;

public class CalcNNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int n = sc.nextInt();

		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		int average = sum / n;
		System.out.println("avg is =" + average);

	}
}