package job;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		����â��
//		Ȯ��
//		���� �� ���� ������ ��ѱ� ã��
//		��ѱ� ã���� ���� ����
//		�ڼ� ������ ��ȸ 1 ����
//		��ȸ�� ���� �� ���� ����

		
		Scanner sc = new Scanner(System.in);
		Magician m = new Magician();
		Random random = new Random();
		
		m.percent = 70;
		m.chance = 5;
		
		String infoMsg = "ȯ���մϴ�. ����� �������Դϴ�.\n" 
				+ "��� �տ��� 3���� ���ڰ� �ְ� 1���� ���ڿ��� ��ѱⰡ �����մϴ�.\n"
				+ "��ѱ⸦ ã�� ������ ������Ű�� ������ ������.\n"
				+ "�������� ������Ű�� ��ȸ�� ���� �� �ֽ��ϴ�.";
		String menu = "��ȣ�� �����ϼ��� \n 1. ù��°���� 2. �ι�°���� 3. ����°����";
		String successMsg = "º ��ѱⰡ ���Խ��ϴ�. \n ��������";
		String failMsg = "��ȸ�� ��� �����ϼ̽��ϴ�. \n ��������";
		String moneyMsg = "���� 100������ �޾ҽ��ϴ�.";
		String clapMsg = "���ߵ��� �����Ͽ� �ڼ��� Ĩ�ϴ�.\n ���ߵ��� �������� ��ȸ�� +1 �����̽��ϴ�.";
		String noClapMsg = "������ ���ߵ��� �������� ���߽��ϴ�.";
		String remainCMsg = "������ȸ: ";
		String missMsg1 = "��ѱ⸦ ã�� ���߽��ϴ�.";
		String missMsg2 = "�� ���ڿ� �־����ϴ�.";
		String errorMsg = "�߸��Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.";
		String myMoneyMsg = "����� �� ���� (���� ����): ";
	
		System.out.println(infoMsg);
		
//		while (m.chance != 0) {
//			System.out.println(menu);
//			m.choice = sc.nextInt();
////				0~2�����Ƿ� +1�� ������
//			m.hatChoice = random.nextInt(3) + 1;
//
//			if (m.choice == m.hatChoice) {
//				System.out.println(successMsg);
//
//				m.getMoney();
//				System.out.println(moneyMsg);
//
//				int[] rating = new int[10];
//				for (int i = 0; i < m.percent / 10; i++) {
//					rating[i] = 1;
//				}
//
//				if (rating[random.nextInt(10)] == 1) {
//					m.chance ++;
//					System.out.println(clapMsg);
//					System.out.println(remainCMsg + m.chance);
//				} else {
//					System.out.println(noClapMsg);
//					System.out.println(remainCMsg + m.chance);
//				}
//				
//			}
//			else if(m.choice > 3 || m.choice < 1) {
//				System.out.println(errorMsg);
//			}
//				
//			else {
//				m.chance--;
//				System.out.println(missMsg1 + m.hatChoice + missMsg2);
//				System.out.println(remainCMsg + m.chance);
//
//			}
//		}
//		System.out.println(failMsg);
//		
//		System.out.println(myMoneyMsg + m.money);
	}
}
