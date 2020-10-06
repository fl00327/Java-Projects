package org.com1027;

public class Randyorton implements Wrestling {


	@Override
	public void themeMusic() {
		System.out.println("Randy Theme Music");
		
	}

	@Override
	public void finisher() {
		System.out.println("Gardan Morna");
		
	}

	@Override
	public void paymentForWork(int hours) {
		 System.out.println("The Wrestler Will make $" + hours*250 +" "+ "for tonight's match");	
	}

}
