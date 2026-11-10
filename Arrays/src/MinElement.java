import java.util.Scanner;
public class MinElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Element: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the array Values: ");
		int[] arr = new int[n];
		
		
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		
		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
		sc.close();
	}
}
