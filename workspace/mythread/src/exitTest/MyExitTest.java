package exitTest;

import javax.swing.JOptionPane;

public class MyExitTest {
	public static void main(String[] args) {
		MyThreadTest myThreadTest = new MyThreadTest();
		Thread thread = new Thread(myThreadTest);
		
		String[] buttons = {"������", "���ϱ�"};
		
		thread.start();
		
		while (true) {
			int choice = JOptionPane.showOptionDialog(null, "", "������ ����", JOptionPane.DEFAULT_OPTION,
					JOptionPane.PLAIN_MESSAGE, null, buttons, null);
			if (choice == 0) {
//				MyThreadTest.isExit = true;
//				thread.interrupt(); //�Ϻη� �̼��� �߻�//static ������ �ٷ� ���� ��.
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
