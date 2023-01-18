package test1;

import java.util.Iterator;
import java.util.Scanner;

public class ForMyTest {
	public static void main(String[] args) {
//      브론즈
//      1~100까지 출력
		
//		int[] num = new int[100];
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
		
//      100~1까지 출력
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 100 - i;
//			System.out.println(num[i]);
//			
//		}
//		1~100까지 중 짝수만 출력
//		for (int i = 0; i < 50; i++) {
////			2의 배수를 생각하면 된다.
//			System.out.println((i + 1) * 2);
//		}
		
//      실버
//      1~10까지 합 출력
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
      
//      1~n까지 합 출력
//		Scanner sc = new Scanner(System.in);
//		int end = 0;
//		int total = 0;
//		String msg ="1에서 n까지의 합 n입력: ";
//		
//		System.out.println(msg);
//		end = sc.nextInt();
//		
//		for (int i = 0; i < end; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);
		
//      골드
//      A~F까지 출력
		
//		A = 65 (A,B,C,D,E,F)
//		int[] num = new int[6];
//		String sNum = null;
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 65 + i;
//			System.out.println((char)num[i]);
//		}
				
//		A~F까지 중 C제외하고 출력
//		A,B,C,D,E,F -> abcef
//		삼항연산자로
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println((char)(i < 2 ? i + 65 : i + 66));
//			if (i == 2){
//				continue;
//			}
//			0,1,2,3,4,5
//			65,66,67,68,69,70
//		}
		
		
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
		for (int i = 0; i < 12; i++) {
			System.out.print(i % 4 + " ");
		}
      
//      aBcDeFgH...Z 출력
//		A~Z =65~90  a~z = 97~122
		for (int i = 0; i < 26; i++) {
//			int num = 65 97 - 65 = 32
			System.out.print((char)(i % 2 == 0 ? i+97 : i + 65));
		}
	}
}
