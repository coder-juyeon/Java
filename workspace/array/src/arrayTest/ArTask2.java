package arrayTest;

import java.util.Scanner;

public class ArTask2 {
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
		
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1", "btn2", "btn3"};
		String[] wrongMsg = {"ȸ�������� ���� �������ּ���.", "�α����� ���� �������ּ���."};
		String[] rightMsg = {"ȸ������ ����", "�α��� ����", "���ֿ�, 23��"};
		String endMsg = "�����մϴ�.";
		String infoMsg = "�����ϼ���.: ";
		String choice = null;
		int number = 0;
		boolean[] state= {false, false};
		boolean end = true;
		
//		1. -> 2 -> 3->
//		2- > 1-> 3
//		3-> 2->
		
		while(end) {
			for (int i = 0; i < arBtn.length; i++) {
				System.out.print(arBtn[i] + "\t");
			}			
			System.out.print(infoMsg);
			number = sc.nextInt() - 1;
			choice = arBtn[number];
			
			switch(choice) {
			case "btn1":
				System.out.println(rightMsg[0]);
				state[0] = true;
				break;
			case "btn2":
				if(state[0] == true) {
					System.out.println(rightMsg[1]);
					state[1] = true;
				}
				else if(state[0] == false) {
					System.out.println(wrongMsg[0]);
				}
				break;
			case "btn3":
				if (state[0] == true && state[1] == true) {
					System.out.println(rightMsg[2]);
					System.out.println(endMsg);
					end = false;
				}
				if (state[1] == false) {
					System.out.println(wrongMsg[1]);
				}
				break;
				
			}
		}
		
		
	}
}
