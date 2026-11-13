import java.util.Scanner;
public class ReverseArray {
	public static void reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		System.out.print("Enter the array elements : ");
		int[] arr = new int[n];
		
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		reverse(arr);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
