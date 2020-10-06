package demo;

public class PracticeE {
	public int Exp(int x,int y) {
		int total = 1;
		for(int i = 0; i < y;i++) {
			total = total *x;
		}
		return total;
	}
	public int RecursiveExp(int x,int n) {
		if(n == 1) {
			return x;
		}
		if(n%2 == 0) {
			int y = RecursiveExp(x, n/2);
			return y*y;
		}else {
			int y = RecursiveExp(x,(n-1)/2);
			return x*y*y;
		}
	}
	public int fact(int x) {
		int tot = 1;
		if( x == 0) {
			tot = 1;
		}else {
		tot = x*fact(x-1);
		}
		return tot;
	}
	public static void main(String[] args) {
		PracticeE p = new PracticeE();
        System.out.println(p.Exp(2,11));
        System.out.println(p.RecursiveExp(2, 11));
        System.out.println(p.fact(1));
	}

}
