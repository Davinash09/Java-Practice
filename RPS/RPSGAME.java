package Method;
import java.util.Scanner;
import java.util.Random;
public class RPS {
	static int cs;
	static int us;
	static int tie;
	static Scanner sc = new Scanner(System.in);
	public void gamestart() {
		
		Random rd = new Random();
		String arr[] = {"r","s","p"};
		//user input
		System.out.println("Enter user Input : ");
		int usi = sc.nextInt();
		if(usi<0 || usi >3) {
			System.out.println("Invalid input");
			return;
		}
		String usc = arr[usi];
		System.out.println("User Input : "+usc);
		//computer input
		
		int cmi = rd.nextInt(3);
		String cmc = arr[cmi];
		System.out.println("Computer input : "+cmc);
		if(usc.equals(cmc)) {
			System.out.println("Game Tied");
			tie++;
		}
		else if(usc.equals("p")&&cmc.equals("r") || 
				usc.equals("r")&&cmc.equals("s") || 
				usc.equals("s")&&cmc.equals("p")) {
			System.out.println("User win!!");
			us++;
		}else if(usc.equals("r")&&cmc.equals("p") || 
				 usc.equals("s")&&cmc.equals("r") || 
				 usc.equals("p")&&cmc.equals("s")) {
			System.out.println("Computer Win!!");
			cs++;
		}
		
			
	}
	
	
	public void score() {
		
		System.out.println("Computer Score : "+cs);
		System.out.println("User Score : "+us);
		System.out.println("No of ties : "+tie);
	}
	public static void main(String[] args) {
		
		RPS obj = new RPS();
		boolean valid = true;
		while(valid) {
			System.out.println(" 1.start game \n 2.GetScore \n 3.exit");
			System.out.print("Enter choice : ");
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				obj.gamestart();
				break;
			case 2 :
				obj.score();
				break;
			case 3:
				valid = false;
				System.out.println("Thanks for playing!!");
				break;
			default :
				System.out.println("Invalid input");
			}
		}
		sc.close();
	}
}
