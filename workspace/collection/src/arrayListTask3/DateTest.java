package arrayListTask3;

import java.util.ArrayList;
import java.util.Iterator;

public class DateTest {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		
		Love Hong = new Love();
		Love Kim = new Love();
		Love Lee = new Love();
		Love Park = new Love();
		
		Hong.setAge(25);
		Hong.setName("ȫ�浿");
		Hong.setIndex(1);
		dateApp.addUser(Hong);
		
		
		Kim.setAge(23);
		Kim.setName("��ö��");
		Kim.setIndex(2);
		dateApp.addUser(Kim);
		
		Lee.setAge(21);
		Lee.setName("�̿���");
		Lee.setIndex(3);
		dateApp.addUser(Lee);
		
		Park.setAge(25);
		Park.setName("������");
		Park.setIndex(4);
		dateApp.addUser(Park);
//		����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ �׽�Ʈ
		System.out.println(dateApp.ageList(25));
		
//		�̻��� ���� �� ����
		dateApp.sort();
		System.out.println(dateApp.loves);
	}
}
