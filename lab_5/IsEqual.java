import java.util.Scanner;

public class IsEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = 0;
        int B = 0;

        System.out.print("Enter a character string: ");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a') {
                A++;
            } else if (ch == 'b') {
                B++;
            } else {
                System.out.println("Invalid character found");
                return;
            }
        }

        if (A == B && A > 0) {
            System.out.println("Pattern is valid");
        } else {
            System.out.println("Pattern is not valid");
        }
    }
}
