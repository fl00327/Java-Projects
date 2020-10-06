package soft;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Colores {
	private List<String> UserName = null;
	private List<String> Password = null;
	
	public Colores(){
		super();
		this.UserName = new ArrayList<String>();
		this.Password = new ArrayList<String>();
	}
	public void addUser(String User) {
		this.UserName.add(User);
	}
	public void addPassword(String pass) {
		this.Password.add(pass);
	}
	public void  removeUser(String User) {
		if(this.UserName.contains(User)) {
			this.UserName.remove(User);
		}else {
			System.out.println("User Does Not Exist");
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Colores c = new Colores();
		 
		String u,p;
		
		System.out.print("Enter Your UserName: ");
		u = input.nextLine();
		
		c.addUser(u);
		
		System.out.print("Enter Your Password: ");
		p = input.nextLine();
		
		c.addPassword(p);
		
		System.out.println("Welcome Back "+ u);
		System.out.println("Currently Logged People "+ c.UserName.size());

	}

}
