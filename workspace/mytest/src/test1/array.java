package test1;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
//		�� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
//		btn1 : ȸ������ ������
//		btn2 : �α��� ������
//		btn3 : ���� ������
		
//		ȸ������ -> �α��� -> ���� ������
//		�� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���,
//		���� �ܰ迡 ���� �޼����� ������ش�.
//		��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
		
//		�˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//		��) ȸ������ Ŭ�� ��, ȸ������ ����
//			���� ������ Ŭ�� ��, ���� �̸��� ���� ���
		
//		temp ���� ����ؼ� ���� �Է��� ����ޱ�
//		�� �迭�� �����ϱ�
		
//		1 -> 2-> 3
//		2 -> 1
//		3 -> 2 -> 1
//		1 -> 3-> 2
		Scanner sc = new Scanner(System.in);
		String msg = "��ư�� �����ϼ���: ";
		String errorMsg = "�߸� �Է��ϼ̽��ϴ�.";
		String endMsg = "�����մϴ�.";
		String result = null;
		String[] arData = {"1. btn1", "2. btn2", "3. btn3", "4. btn4"};
		String[] wrongMsg = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���."};
		String[] rightMsg = {"ȸ������ ����", "�α��� ����", "���ֿ�(23)"};
		boolean end = true;
		int choice = 0;
		int temp = 0;
		boolean condition = false;
		
		
		while(end) {
			for (int i = 0; i < arData.length; i++) {
				System.out.print(arData[i] + "\t");
			}
			System.out.print(msg);
			
			temp = choice;          //�� ���� ������ �߿�!!
			choice = sc.nextInt(); //�� ���� ������ �߿�!!
			condition = choice - 1 == temp;
			
			switch(choice) {
			case 1:
				result = rightMsg[choice -1];
				break;
			case 2:
				result = condition ? rightMsg[choice -1] : wrongMsg[choice -2];
				if(!condition) {
					choice = 0;
				}
				break;
			case 3:
				result = condition ? rightMsg[choice -1] : wrongMsg[choice -2];
				if(!condition) {
					choice = 0;
				}
				break;
			case 4:
				end = false;
				result = endMsg;
				break;
			default:
				break;
			}
			System.out.println(result);
			
		}

	}
}
