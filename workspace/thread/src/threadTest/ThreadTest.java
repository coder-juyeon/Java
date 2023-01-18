package threadTest;

public class ThreadTest {
	public static void main(String[] args) {
		
//		Thread2 thread = new Thread2();
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName());
				try {Thread.sleep(500);} catch (InterruptedException e) {;}
			}
		};
		
		Thread t1 = new Thread(target, "?");
		Thread t2 = new Thread(target, "!");
		
		t2.start();
		
		try {t2.join();} catch (InterruptedException e) {;}
		
		t1.start();
		
//		메인이 우선이라서 join 다음에 나온다. 
		System.out.println("안녕");
		
//		Thread1 t1 = new Thread1("♥");
//		Thread1 t2 = new Thread1("★");
//		
//		t1.start();
//		t2.start();
		
//		t1.run();
//		t2.run();
	}
}














