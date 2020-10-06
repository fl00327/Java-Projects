package org.com1027;

public class Kane implements Wrestling {

	@Override
	public void themeMusic() {
	System.out.println("Kane into Song will be DeathWriter");
		
	}

	@Override
	public void finisher() {
		System.out.println("Kane Finsisher is DeathTrap");
	}

	@Override
	public void paymentForWork(int hours) {
		 System.out.println("The Wrestler Will make $"+ "\n"+ "\t"+hours*250 +" "+ "for tonight's match");	
	}
	

}
