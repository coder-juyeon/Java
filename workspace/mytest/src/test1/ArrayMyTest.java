package test1;

import java.util.Scanner;

public class ArrayMyTest {
	public static void main(String[] args) {
//		사용자에게 입력받은 문자열 중 소문자는 모두 대문자로, 대문자는 모두 소문자로 변경한다.
//		A~Z =65~90  a~z = 97~122
//		97- 65 = 32
		Scanner sc = new Scanner(System.in);
		String string = null;
		String result = "";
		
		System.out.print("문자열을 입력하세요.: (영어로)");
		string = sc.nextLine();
		
		for (int i = 0; i < string.length(); i++) {
			System.out.print((int)string.charAt(i) + "\n");
			if((int)string.charAt(i) >= 65 && (int)string.charAt(i) <= 90) {
				
			}
		}
		
	}
}
