package test1;

import java.util.Scanner;

public class ArrayMyTest {
	public static void main(String[] args) {
//		����ڿ��� �Է¹��� ���ڿ� �� �ҹ��ڴ� ��� �빮�ڷ�, �빮�ڴ� ��� �ҹ��ڷ� �����Ѵ�.
//		A~Z =65~90  a~z = 97~122
//		97- 65 = 32
		Scanner sc = new Scanner(System.in);
		String string = null;
		String result = "";
		
		System.out.print("���ڿ��� �Է��ϼ���.: (�����)");
		string = sc.nextLine();
		
		for (int i = 0; i < string.length(); i++) {
			System.out.print((int)string.charAt(i) + "\n");
			if((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) {
				
			}
		}
		
	}
}
