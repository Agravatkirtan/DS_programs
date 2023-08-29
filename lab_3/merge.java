import java.util.*;			

public class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array1 length:");
        int size1 = sc.nextInt();
        int array1[] = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.println("Enter array1 element:");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter array2 length:");
        int size2 = sc.nextInt();
        int array2[] = new int[size2];

        for (int i = 0; i < size2; i++) {
            System.out.println("Enter array2 element:");
            array2[i] = sc.nextInt();
        }

        int mergedSize = size1 + size2;
        int mergedArray[] = new int[mergedSize];

        
        for (int i = 0; i < size1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            mergedArray[size1 + i] = array2[i];
        }

        System.out.println("Merged Array:");
        for (int i = 0; i < mergedSize; i++) {
            System.out.print(mergedArray[i] + " ");
        }
    }
}


