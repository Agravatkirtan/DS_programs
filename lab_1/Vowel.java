import java.util.Scanner;
public class Vowel{
	public static void main(String[] args) {
		char alpha ;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		alpha=sc.next().charAt(0);
        if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u' || alpha=='A' || alpha=='E' || alpha=='I' || alpha=='O' || alpha=='U' ){
        	System.out.println(alpha+" is Vowel");
        }
        else{
        	System.out.println(alpha+" is Consonant");
        }
	}
}