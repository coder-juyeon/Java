package operTest;

import java.util.Scanner;

public class Oper3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예)	183 -> 183 출력
//			183.5 -> 183.5 출력
//		삼항 연산자를 사용!
		
//		힌트!
//		뺄셈으로 풀면 쉬움
//		서식문자로 풀면 더 쉬움
		
		Scanner sc = new Scanner(System.in);
		double height, sub = 0.0;
		String question = "당신의 키는?: ";
		String answer = null;
//		boolean check = false; //기본형 false
		
		System.out.print(question);
		height = Double.parseDouble(sc.next()); //sc.nextDouble()
		
		sub = height - (int)height;
		
		answer = sub == 0 ? "당신의 키는: %.0f" : "당신의 키는: %.1f";
		System.out.printf(answer,height);
	}
}
