import java.util.Scanner;
public class SecondMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array :");
		int n = sc.nextInt();
		
		System.out.print("Enter the array elements: ");
		int[] arr = new int[n];
		
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
		int max1 = arr[0];
		int max2 = arr[1];
		
		for(int i=0 ; i<arr.length ; i++) {
			if(arr[i]>max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if(arr[i]<max1 && arr[i]>max2) {
				max2 = arr[i];
			}
		}
		System.out.println("Your max element: "+max1);
		System.out.println("Your second max element :"+max2);
		sc.close();
	}
}
