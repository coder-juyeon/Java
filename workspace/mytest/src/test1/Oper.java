package test1;

import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
//		����ڰ� �Է��� �� ���� ��� ��
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0;
		String msg = "%d�� %d �� �� ū ��: %d";
		String exmsg = "�� ���� �����ϴ�.";
		
		System.out.print("ù��° ���� �Է�: ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("�ι�° ���� �Է�: ");
		num2 = Integer.parseInt(sc.next());
		
		if (num1 > num2) {
			result = num1;
			System.out.printf(msg, num1, num2, result);
		}
		else if(num1 < num2) {
			result = num2;
			System.out.printf(msg, num1, num2, result);
		}
		else {
			System.out.print(exmsg);
		}
	}
}
