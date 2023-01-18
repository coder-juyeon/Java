package test1;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		
		System.out.print("이름 입력: ");
		name = sc.nextLine();
		
		System.out.println("환영합니다."+name + "님");
	}
}
