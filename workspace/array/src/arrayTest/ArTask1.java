package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
//		�����
//		1~10���� �迭�� ��� ���
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			System.out.println(arData[i]);
//		}
//		System.out.println("=========");
//		
//		10~1���� �� ¦���� �迭�� ��� ���
//		
//		int[] arData = new int[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//			arData[i] = 10 - i * 2;
//      }
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.println(arData[i]);
//      }

//		
//		for (int i = 0; i < arData.length; i++) {
//			if (arData[i] % 2 == 0) {
//				System.out.println(arData[i]);
//			}
//		}
//		System.out.println("=========");
//		
////		1~100���� �迭�� ���� �� Ȧ���� ���
//		int[] arData2 = new int[100];
//		for (int i = 0; i < arData2.length; i++) {
//			arData2[i] = i+1;
//			if(arData2[i] % 2 == 1) {
//				System.out.print(arData2[i] + "\t");
//			}
//		}
//		System.out.println("=========");
//		
//		
////		�ǹ�
////		1~100���� �迭�� ���� �� ¦���� �� ���
//		int[] arData3 = new int[100];
//		int sum = 0;
//		
//		for (int i = 0; i < arData3.length; i++) {
//			arData3[i] = i+1;
//			if(arData3[i] % 2 == 0) {
//				sum = sum + arData3[i];
//			}
//		}
//		System.out.println(sum);
//		System.out.println("=========");
//		
////		A~F���� �迭�� ��� ��� 
//		char[] arData4 = new char[6];
//		for (int i = 0; i < arData4.length; i++) {
//			arData4[i] = (char)(i+65);
//			System.out.println(arData4[i]);
//		}
//		System.out.println("=========");
//		
////		A~F���� �� C �����ϰ� �迭�� ���� �� ��� a,b,c,d,e,f
//		for (int i = 0; i < 6; i++) {
//			arData4[i] = (char)(i+65);
//			if(arData4[i] == 67) {
//				continue;
//			}
//			System.out.println((char)arData4[i]);
//		}
//		System.out.println("=========");
//		
//		���
//		5���� ������ �Է¹޾� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//		int[] arData5 = new int[5];
//		int max=0, min = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arData5.length; i++) {
//			System.out.println("���� �Է�: ");
//			arData5[i] = sc.nextInt();
//		}
//		max = arData5[0];
//		min = arData5[0];
//		
//		for (int i = 1; i < arData5.length; i++) { //�Ȱ��� ���� ���� �ʿ� �����ϱ� i�� 1����
//			if(arData5[i] > max){
//				max = arData5[i];
//			}
//			if(arData5[i] < min){
//				min = arData5[i];
//			}
//		}
//		System.out.println("�ִ밪: " + max);
//		System.out.println("�ּҰ�: " + min);
//		
//		System.out.println("=========");

//		���̾�; 
//		����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		int sum2 = 0;
		double avg = 0.0;
		int[] arData6 = null;
		
		System.out.println("�� ���� �Է��Ͻðڽ��ϱ�?: ");
		number = sc.nextInt();
		arData6 = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print(i + 1 +"��° ���� �Է�: ");
			arData6[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arData6.length; i++) {
			System.out.print(arData6[i]);
			sum2 += arData6[i];
		}
		avg = (double)sum2 / arData6.length;
		
		System.out.println(sum2);
		System.out.println(avg);
		
	}
}
