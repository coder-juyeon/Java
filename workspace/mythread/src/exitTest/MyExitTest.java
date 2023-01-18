package exitTest;

import javax.swing.JOptionPane;

public class MyExitTest {
	public static void main(String[] args) {
		MyThreadTest myThreadTest = new MyThreadTest();
		Thread thread = new Thread(myThreadTest);
		
		String[] buttons = {"나가기", "일하기"};
		
		thread.start();
		
		while (true) {
			int choice = JOptionPane.showOptionDialog(null, "", "쓰레드 종료", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, buttons, null);
			if (choice == 0) {
//				MyThreadTest.isExit = true;
//				thread.interrupt(); //일부로 이셉션 발생//static 변수라 바로 갖다 씀.
//				break;
				System.exit(0);
			} else {
				synchronized (myThreadTest) {
					myThreadTest.notify();
				}
			} 
		}
	}
}
