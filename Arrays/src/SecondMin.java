import java.util.Scanner;
public class SecondMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Size of array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the arrays: ");
		int[] arr = new int[n];
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int smin = arr[1];
		
		for(int i=0 ; i<arr.length ; i++) {
			if(min>arr[i]) {
				smin = min;
				min = arr[i];
			}
			else if(arr[i]>min && arr[i]<smin) {
				smin = arr[i];
			}
		}
		System.out.println("your second minimum :"+smin);
		System.out.println("your minimum :"+min);
		sc.close();
	}
}
