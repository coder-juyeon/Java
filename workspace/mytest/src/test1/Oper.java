package test1;

import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
//		사용자가 입력한 두 정수 대소 비교
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0;
		String msg = "%d와 %d 중 더 큰 수: %d";
		String exmsg = "두 수는 같습니다.";
		
		System.out.print("첫번째 정수 입력: ");
		num1 = Integer.parseInt(sc.next());
		System.out.print("두번째 정수 입력: ");
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
