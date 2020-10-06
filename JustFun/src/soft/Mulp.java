package soft;
import java.util.Scanner;

public class Mulp {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String UserName, Password;
		
		System.out.print("Enter Your Ussername:");
		UserName = input.nextLine();
		
		System.out.print("Enter Your Password: ");
		Password = input.nextLine();
		
		if(UserName.equals("fl00327") && Password.equals("Khan21902")) {
			System.out.println("Welcome Back Faseeh");
		}else {
			System.out.println("We are Calling the Boss, Log out of the PC");
		}
	}
}
