package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		�ɸ� �׽�Ʈ
		/*
		 * Q. ����� �����ϴ� ���� �����ϼ���.
		 * 1. ������
		 * 2. �����
		 * 3. ������
		 * 4. ���
		 * 
		 * ������ : �Ұ��� �������̰� �������̴�.
		 * ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
		 * ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
		 * ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		String question = "����� �����ϴ� ���� ��ȣ�� �����ϼ���: ";
		String menu = "1.������ 2.����� 3.������ 4.���";
		String red = "�Ұ��� �������̰� �������̴�.";
		String yellow = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
		String black = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
		String white = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
		String result = null;
		String errorMsg = "�߸� �Է��ϼ̽��ϴ�.";
		int answer = 0;
		
		System.out.println(menu);
		System.out.print(question);
		answer = Integer.parseInt(sc.next()); //sc.nextInt();
		
		result = answer == 1 ? red : answer == 2 ? yellow : answer == 3 ? black : answer == 4 ? white : errorMsg; 
		
		System.out.println(result);
	}
}
