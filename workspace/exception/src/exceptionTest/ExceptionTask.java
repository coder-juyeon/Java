package exceptionTest;

import java.util.Scanner;

public class ExceptionTask {
	public static void main(String[] args) {
//		5���� ������ �Է¹ޱ�
//		-���� �Է� ���·� ����
//		-q �Է� �� ������
//		- �� ������ �迭�� ���
//		- if���� �� �� ���� ����ϱ�
		
//		int[] arData = new int[5];
//		Scanner sc = new Scanner(System.in);
//		String choice = null;
//		
//		while (true) { //for(int i=0;; i++) for������ ���ѹݺ�
//			System.out.println("������ �ƹ��ų� �Է��Ͻð� �������� q�� �Է��ϼ���.");
//			choice = sc.next();
//			choice = choice.toLowerCase(); //������ �ҹ��ڷ� �ٲ���
//			System.out.println(choice);
//			if(choice.equals("q")) {
//				break;
//			}
//			System.out.print("���� 5���� �Է��ϼ��� ��)5 6 7 9 10: ");
//			for (int i = 0; i < arData.length; i++) {
//				try {
//					arData[i] = sc.nextInt();
//				} catch (InputMismatchException e) {
//					System.out.println("���ڸ� �Է��ϼ���.");
//				} catch (ArrayIndexOutOfBoundsException e) {
//					System.out.println("5���� ������ �Է��� �����մϴ�.");
//					for (int j = 0; j < arData.length; j++) {
//						System.out.print(arData[j]);
//					}
//					break;
//				} catch (Exception e) {
//					System.out.println("�ٽ� �õ����ּ���. ");
//				}
//			}
//			
//		}
		int[] arData = new int[5];
		String temp = null;
		
		Scanner sc = new Scanner(System.in);
		for (int i=0; ; i++) {
			System.out.printf("q�Է½� ������\n %d��° ���� �Է�: ",i+1);
			temp = sc.next();
			temp = temp.toLowerCase();
			
			if(temp.equals("q")) {
				break;
			}
			
			try {
				arData[i] = Integer.parseInt(temp);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�ε��� ������ �ʰ��Ͽ����ϴ�.");
				for (int j = 0; j < arData.length; j++) {
		               System.out.print(arData[j] +" ");
		            }
				
			} catch(NumberFormatException e) {
				System.out.println("������ �Է��ϼ���.");
				i--;
				
			} catch(Exception e) {
				System.out.println("�ٽ� �õ��� �ּ���.");
				i--;
			}
		}
	}
}

