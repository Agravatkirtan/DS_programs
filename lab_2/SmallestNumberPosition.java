import java.util.Scanner;

public class SmallestNumberPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Input the numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the position of the smallest number
        int smallestNumber = numbers[0];
        int smallestNumberPosition = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] < smallestNumber) {
                smallestNumber = numbers[i];
                smallestNumberPosition = i;
            }
        }

        // Display the result
        System.out.println("The smallest number is: " + smallestNumber);
        System.out.println("Position of the smallest number is: " + smallestNumberPosition);
    }
}
