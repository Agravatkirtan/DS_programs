import java.util.Scanner;
public class insertion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many element you want in array");
		int n = sc.nextInt();
		int array[] = new int[n];
   
		for(int i=0 ;i<n ;i++){
			System.out.println("enter element in array");
			array[i + 1] = sc.nextInt();
		}

		System.out.println("enter position of element that you want to insert");
		int position = sc.nextInt();
		position = n-1;

		int newArray[] = new int[n+1];

		for(int i =0 ; i<position ; i++){
			newArray[i] = array[i];
		}
		for (int i=0;i<array.length ;i++ ) {
			newArray[i+1] = array[i];
			
		}
		System.out.println(newArray);

	}
}