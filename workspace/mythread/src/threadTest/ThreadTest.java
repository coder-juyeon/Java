package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
			}
		};
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t1.start();
		t2.start();
	}
	
}
