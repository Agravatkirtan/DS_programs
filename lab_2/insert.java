import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
        int[] array = { 1, 2, 4, 5, 6 };
        int numberToInsert = 3;
        int position = 2;

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        newArray[position] = numberToInsert;

        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("Modified Array: " + Arrays.toString(newArray));
    }
}
