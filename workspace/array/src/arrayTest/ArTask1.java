package arrayTest;

import java.util.Iterator;
import java.util.Scanner;

public class ArTask1 {
	public static void main(String[] args) {
//		브론즈
//		1~10까지 배열에 담고 출력
//		int[] arData = new int[10];
//		
//		for (int i = 0; i < arData.length; i++) {
//			arData[i] = i+1;
//			System.out.println(arData[i]);
//		}
//		System.out.println("=========");
//		
//		10~1까지 중 짝수만 배열에 담고 출력
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
////		1~100까지 배열에 담은 후 홀수만 출력
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
////		실버
////		1~100까지 배열에 담은 후 짝수의 합 출력
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
////		A~F까지 배열에 담고 출력 
//		char[] arData4 = new char[6];
//		for (int i = 0; i < arData4.length; i++) {
//			arData4[i] = (char)(i+65);
//			System.out.println(arData4[i]);
//		}
//		System.out.println("=========");
//		
////		A~F까지 중 C 제외하고 배열에 담은 후 출력 a,b,c,d,e,f
//		for (int i = 0; i < 6; i++) {
//			arData4[i] = (char)(i+65);
//			if(arData4[i] == 67) {
//				continue;
//			}
//			System.out.println((char)arData4[i]);
//		}
//		System.out.println("=========");
//		
//		골드
//		5개의 정수를 입력받아 배열에 담은 후 최대값과 최소값 출력
//		int[] arData5 = new int[5];
//		int max=0, min = 0;
//		Scanner sc = new Scanner(System.in);
//		
//		for (int i = 0; i < arData5.length; i++) {
//			System.out.println("정수 입력: ");
//			arData5[i] = sc.nextInt();
//		}
//		max = arData5[0];
//		min = arData5[0];
//		
//		for (int i = 1; i < arData5.length; i++) { //똑같은 것을 비교할 필요 없으니까 i를 1부터
//			if(arData5[i] > max){
//				max = arData5[i];
//			}
//			if(arData5[i] < min){
//				min = arData5[i];
//			}
//		}
//		System.out.println("최대값: " + max);
//		System.out.println("최소값: " + min);
//		
//		System.out.println("=========");

//		다이아; 
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		int sum2 = 0;
		double avg = 0.0;
		int[] arData6 = null;
		
		System.out.println("몇 개를 입력하시겠습니까?: ");
		number = sc.nextInt();
		arData6 = new int[number];
		
		for (int i = 0; i < number; i++) {
			System.out.print(i + 1 +"번째 정수 입력: ");
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
