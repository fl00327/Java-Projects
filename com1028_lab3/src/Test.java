public class Test {
	public static void main(String[] args) {
		Thread thrd1 = new Thread(new Runnable() {
			public void run() {
				for (int i=0;i<100;i++)
					System.out.println(i + ": Inside Thread 1");
			}
		});

		
		Thread thrd2 = new Thread(new Runnable() {
			public void run() {
				for (int i=0;i<100;i++)
					System.out.println(i + ": Inside Thread 2");
			}
		});
		thrd1.start();
		thrd2.start();
	}
}
