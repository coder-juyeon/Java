package controllStatement;

import java.util.Scanner;

public class DoWhileTest {
	public static void main(String[] args) {
		String message = "1. �����ȸ\n 2. ��Ż� �̵�\n 3. ��⺯��\n 0.���� ����";
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println(message);
			choice = sc.nextInt();
		} while(choice != 0);
	}
}
