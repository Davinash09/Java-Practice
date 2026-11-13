import java.util.Arrays;
import java.util.Scanner;
public class Zerostofront {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size :");
		int n = sc.nextInt();
		
		System.out.print("Enter array elements: ");
		int[] arr = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		int j=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				int tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
				j++;
			}
	
		
		}
		System.out.println(Arrays.toString(arr));
		sc.close();
		
		
	}

}
