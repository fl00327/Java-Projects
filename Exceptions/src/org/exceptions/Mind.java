package org.exceptions;
import java.util.*;
public class Mind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int x = 1;
do {
try {
System.out.println("Enter yout First Number:");
int n1 = input.nextInt();
System.out.println("Enter the Second Number:");
int n2 = input.nextInt();
int sum = n1/n2;
System.out.println(sum);
x=2;
}
catch(Exception e) {
	System.out.println("You Dumb Physocopath you have to go back in primary school and learn that you cant divide any number by zero");
}
}while(x==1);
	}

}






















