package test1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		
		System.out.print("�̸� �Է�: ");
		name = sc.nextLine();
		
		System.out.println("ȯ���մϴ�."+name + "��");
	}
}
