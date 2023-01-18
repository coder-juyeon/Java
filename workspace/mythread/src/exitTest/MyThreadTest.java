package exitTest;

public class MyThreadTest implements Runnable{
	public static boolean isExit; //static으로 선언해야 바로 반영됨
	
	@Override
	public void run() {
		int count = 0;
		while(true) {
			System.out.println("진행중 ...");
			if(++count == 5) {
				synchronized (this) {
					try {count = 0; wait();} catch (InterruptedException e) {System.out.println("InterruptedException으로 종료"); break;}
				}
			}
//			try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("InterruptedException으로 종료"); break;}
//			if(isExit) {System.out.println("static 필드로 쓰레드 종료");break;}
		}
	}
}
