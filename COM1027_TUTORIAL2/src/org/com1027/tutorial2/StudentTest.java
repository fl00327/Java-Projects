package org.com1027.tutorial2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Module m1 = new Module("com1027");
		Student s1 = new Student("faseeh", "lodhi", 10, m1);
		System.out.println(s1);
		System.out.println(s1.getForename() );
		System.out.println(s1.getModule());
		
	}

	@Override
	public String toString() {
		return "StudentTest []";
	}

}
