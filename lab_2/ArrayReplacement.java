import java.util.Scanner;

public class ArrayReplacement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] numbers = new int[size];

        // Read the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Read the two different numbers
        System.out.print("Enter the number to be replaced: ");
        int numberToReplace = scanner.nextInt();

        System.out.print("Enter the new number: ");
        int newNumber = scanner.nextInt();

        // Find the index of the first occurrence of the number to replace
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (numbers[i] == numberToReplace) {
                index = i;
                break;
            }
        }
        // Replace the number if found
        if (index != -1) {
            numbers[index] = newNumber;
        }

        // Print the index and the final array
        System.out.println("Index: " + index);
        System.out.print("Final Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}