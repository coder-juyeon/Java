package test1;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//      �ɸ� �׽�Ʈ
      /*
       * Q. ����� �����ϴ� ���� �����ϼ���.
       * 1. ������
       * 2. �����
       * 3. ������
       * 4. ���
       * 5. ������
       * ������ : �Ұ��� �������̰� �������̴�.
       * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
       * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
       * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
       * 
       * while���� ����Ͽ� ����ڰ� 5���� ������ �� �����Ű��
       */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String question = "����� �����ϴ� ���� ��ȣ�� �����ϼ���: ";
		String menu = "1.������ \n2.�����\n 3.������\n 4.���\n 5.������";
		String red = "�Ұ��� �������̰� �������̴�.";
		String yellow = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String black = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String white = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String byemsg = "�����մϴ�.";
		String errormsg = "�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.";
		String result = null;
		
		while (num != 5) {
			System.out.println(question);
			System.out.println(menu);
			
			num = sc.nextInt();
			
			switch(num){
			case 1 :
				result = red;
				break;
			case 2 :
				result = yellow;
				break;
			case 3 :
				result = black;
				break;
			case 4 :
				result = white;
				break;
			case 5 :
				result = byemsg;
				break;
			default :
				result = errormsg;
				break;
			}
			System.out.println(result);
			if (num == 5) {
				break;
			}
			
		}
	}
}
