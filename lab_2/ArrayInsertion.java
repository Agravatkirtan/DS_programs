import java.util.Scanner;

public class ArrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to insert: ");
        int numberToInsert = scanner.nextInt();

        System.out.print("Enter the position to insert the number (0-indexed): ");
        int position = scanner.nextInt();

        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            int[] newArray = new int[size + 1];
            for (int i = 0; i < position; i++) {
                newArray[i] = numbers[i];
            }

            newArray[position] = numberToInsert;

            for (int i = position; i < size; i++) {
                newArray[i + 1] = numbers[i];
            }

            System.out.println("Array after insertion:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}
