package org.com1027.lab5;

import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String FORMAT_REGEX = "(AA)[0-9]{6}(A)";
		final String GASBILL_REGEX = "[0-9]{4}[-|(\\s][0-9]{4}-[0-9]{4}";
		String electric = "2344-3456-7890";
		String exersize = "1234-3456-7890";
		String text = "";
		check = Pattern.matches(FORMAT_REGEX,text);
		if (electric.matches(GASBILL_REGEX)) {
			System.out.println("Your Format Is Correct For the Module");
		}else {
			System.out.println("Your Format is Wrong");
		}
	}

}
