package exitTest;

public class MyThreadTest implements Runnable{
	public static boolean isExit; //static���� �����ؾ� �ٷ� �ݿ���
	
	@Override
	public void run() {
		int count = 0;
		while(true) {
			System.out.println("������ ...");
			if(++count == 5) {
				synchronized (this) {
					try {count = 0; wait();} catch (InterruptedException e) {System.out.println("InterruptedException���� ����"); break;}
				}
			}
//			try {Thread.sleep(1000);} catch (InterruptedException e) {System.out.println("InterruptedException���� ����"); break;}
//			if(isExit) {System.out.println("static �ʵ�� ������ ����");break;}
		}
	}
}
