import java.util.Scanner;
public class ArraySorting {
	static void asc(int[] arr) {
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	static void dsc(int[] arr) {
		
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=i+1 ; j<arr.length ; j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter size of array : ");
		 int n = sc.nextInt();
		 
		 System.out.print("Enter array elements : ");
		 int[] arr = new int[n];
		 
		 for(int i=0 ; i<n ; i++) {
			 arr[i] = sc.nextInt();
		 }
		 
		 asc(arr);
		 for(int i=0 ; i<n ; i++) {
			 System.out.print(arr[i]);
		 }
		 System.out.println();
		 dsc(arr);
		 for(int i=0 ; i<n ; i++) {
			 System.out.print(arr[i]);
		 }
		 sc.close();
	}
}
