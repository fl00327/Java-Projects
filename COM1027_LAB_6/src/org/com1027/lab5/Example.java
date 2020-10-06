package org.com1027.lab5;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1 = "bad";
System.out.println(s1);
String s2 = "night";
String s3 = s1 + " " + s2;
System.out.println(s3);
System.out.println(s1.length());
System.out.println(s1.charAt(0));
System.out.println(s1.charAt(1));
System.out.println(s1.charAt(2));
final String FORMAT_REGEX = "[A-Z]{3}[0-9]{4}";
String exersize = "COM1027";
if (exersize.matches(FORMAT_REGEX)) {
	System.out.println("Your Format Is Correct For the Module");
}
String s4  = new String("good");
System.out.println("s4 = " + s4);
System.out.println("has s1 and s4 changed");
System.out.println("s1 = " + s4);
System.out.println("s4 = " + s1);
String s5 = new String(s2);
System.out.println("s5 = " + s5);
System.out.println("has s2 and s1 changed");
System.out.println("s2 = " + s2);
System.out.println("s5 = " + s5);
if (s2.equals(s5)) {
	System.out.println("The two Strings are equal");
}else {
	System.out.println("The two Strings are not Equal");
}
String s6 = "COM1027";
String s7 = new String("COM1026");
s7 = "COM1027";
 if (s6 == s7) {
	 System.out.println("s6 equals s7");
 }else {
	 System.out.println("s6 does NOT equals s7");
 }
 s1 = "Night";
 s2 = "night";
 if (s1.equalsIgnoreCase(s2)) {
 System.out.println("the two strings are equal ignoring case");
	}else {
		 System.out.println("the two stringd are not equal ignoring case");
	}
 String refrence = "HO1234";
 boolean foundMatch = refrence.matches("(HO)([0-4]{4})");
 if (foundMatch) {
	 System.out.println("Refrence Number Is Valid");
 }else {
	 System.out.println("Refrence Number is Not Valid");
 }
		 
	}






}
	


