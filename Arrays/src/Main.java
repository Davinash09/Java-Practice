import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Students: ");
		int n = sc.nextInt();
		
		int[] marks = new int[n];
		
		System.out.println("Enter students Marks: ");
		
		for(int i=0 ; i<n ; i++) {
			marks[i] = sc.nextInt();
		}
		
		int sum = 0;
		int max = marks[0];
		int min = marks[0];
		
		for(int i=0 ; i<n ; i++) {
			sum = sum+marks[i];
			
			if(marks[i]>max) {
				max = marks[i];
			}
			if(marks[i]<min) {
				min = marks[i];
			}
		}
		double avg = sum/n;
		
		System.out.println("Sum:"+sum);
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		System.out.println("avg:"+avg);
		
		sc.close();
		
	}

}
