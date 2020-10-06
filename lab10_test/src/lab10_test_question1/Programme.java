package lab10_test_question1;

public class Programme {
	private String code = null;
	private String name = null;

public Programme(String code, String name) throws IllegalArgumentException{
		super();
		if(code.matches("[A-Z]{3}[0-9]{4}")) {
		this.code = code;
		}else {
			throw new IllegalArgumentException("Check your code name");
		}
		if(name.matches("[A-Z][a-z]+")) {
			this.name = name;
		}else {
			throw new IllegalArgumentException("Use a sensible name for your course");
		}
		
	}
public String getCode() {
	return this.code;
}
public String getName() {
	return this.name;
}
}
