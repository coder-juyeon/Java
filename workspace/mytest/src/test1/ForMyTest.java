package test1;

import java.util.Iterator;
import java.util.Scanner;

public class ForMyTest {
	public static void main(String[] args) {
//      �����
//      1~100���� ���
		
//		int[] num = new int[100];
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = i+1;
//			System.out.println(num[i]);
//		}
		
//      100~1���� ���
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 100 - i;
//			System.out.println(num[i]);
//			
//		}
//		1~100���� �� ¦���� ���
//		for (int i = 0; i < 50; i++) {
////			2�� ����� �����ϸ� �ȴ�.
//			System.out.println((i + 1) * 2);
//		}
		
//      �ǹ�
//      1~10���� �� ���
//		int sum = 0;
//		
//		for(int i=0; i<10; i++) {
//			sum += i+1;
//		}
//		System.out.println(sum);
      
//      1~n���� �� ���
//		Scanner sc = new Scanner(System.in);
//		int end = 0;
//		int total = 0;
//		String msg ="1���� n������ �� n�Է�: ";
//		
//		System.out.println(msg);
//		end = sc.nextInt();
//		
//		for (int i = 0; i < end; i++) {
//			total += i + 1;
//		}
//		System.out.println(total);
		
//      ���
//      A~F���� ���
		
//		A = 65 (A,B,C,D,E,F)
//		int[] num = new int[6];
//		String sNum = null;
//		
//		for (int i = 0; i < num.length; i++) {
//			num[i] = 65 + i;
//			System.out.println((char)num[i]);
//		}
				
//		A~F���� �� C�����ϰ� ���
//		A,B,C,D,E,F -> abcef
//		���׿����ڷ�
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println((char)(i < 2 ? i + 65 : i + 66));
//			if (i == 2){
//				continue;
//			}
//			0,1,2,3,4,5
//			65,66,67,68,69,70
//		}
		
		
//      ���̾�
//      0 1 2 3 0 1 2 3 0 1 2 3 ���
		for (int i = 0; i < 12; i++) {
			System.out.print(i % 4 + " ");
		}
      
//      aBcDeFgH...Z ���
//		A~Z =65~90  a~z = 97~122
		for (int i = 0; i < 26; i++) {
//			int num = 65 97 - 65 = 32
			System.out.print((char)(i % 2 == 0 ? i+97 : i + 65));
		}
	}
}
