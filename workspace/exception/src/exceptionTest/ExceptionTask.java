package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5개의 정수만 입력받기
//		-무한 입력 상태로 구현
//		-q 입력 시 나가기
//		- 각 정수는 배열에 담기
//		- if문은 딱 한 번만 사용하기
		
//		int[] arData = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String choice = null;
//		
//		while (true) { //for(int i=0;; i++) for문으로 무한반복
//			System.out.println("시작은 아무거나 입력하시고 나가려면 q를 입력하세요.");
//			choice = sc.next();
//			choice = choice.toLowerCase(); //무조건 소문자로 바꿔줌
//			System.out.println(choice);
//			if(choice.equals("q")) {
//				break;
//			}
//			System.out.print("정수 5개를 입력하세요 예)5 6 7 9 10: ");
//			for (int i = 0; i < arData.length; i++) {
//				try {
//					arData[i] = sc.nextInt();
//				} catch (InputMismatchException e) {
//					System.out.println("숫자만 입력하세요.");
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("5개의 정수만 입력이 가능합니다.");
//					for (int j = 0; j < arData.length; j++) {
//						System.out.print(arData[j]);
//					}
//					break;
//				} catch (Exception e) {
//					System.out.println("다시 시도해주세요. ");
//				}
//			}
//			
//		}
		int[] arData = new int[5];
		String temp = null;
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; ; i++) {
			System.out.printf("q입력시 나가기\n %d번째 정수 입력: ",i+1);
			temp = sc.next();
			temp = temp.toLowerCase();
			
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[i] = Integer.parseInt(temp);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 범위를 초과하였습니다.");
				for (int j = 0; j < arData.length; j++) {
		               System.out.print(arData[j] +" ");
		            }
				
			} catch(NumberFormatException e) {
				System.out.println("정수만 입력하세요.");
				i--;
				
			} catch(Exception e) {
				System.out.println("다시 시도해 주세요.");
				i--;
			}
		}
	}
}

