package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		����ڿ��� Ű�� �Է¹ް�
//		������� ������ ���
//		�Ǽ���� �Ǽ��� ���
//		��)	183 -> 183 ���
//			183.5 -> 183.5 ���
//		���� �����ڸ� ���!
		
//		��Ʈ!
//		�������� Ǯ�� ����
//		���Ĺ��ڷ� Ǯ�� �� ����
		
		Scanner sc = new Scanner(System.in);
		double height, sub = 0.0;
		String question = "����� Ű��?: ";
		String answer = null;
//		boolean check = false; //�⺻�� false
		
		System.out.print(question);
		height = Double.parseDouble(sc.next()); //sc.nextDouble()
		
		sub = height - (int)height;
		
		answer = sub == 0 ? "����� Ű��: %.0f" : "����� Ű��: %.1f";
		System.out.printf(answer,height);
	}
}
