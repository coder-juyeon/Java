package bankTest;

import java.util.Scanner;

//"���°���, �Ա��ϱ�, ����ϱ�, �ܾ���ȸ, ���¹�ȣ ã��(���ο� ���¹߱� ->
//���� �߱��ϸ� ���¹�ȣ �𸣴ϱ� �ڵ��� ��ȣ�� ��й�ȣ�� ���� �̿밡���ϰ�), ������"�� �����Ǿ� �ִ�.

public class Screen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		Bank[] arBank = null;
		Bank user = new Bank();
		
		int index = 0;
		int serviceChoice = 0;
		
		
		while(true) {
			System.out.println("���༱��: 1. ���� 2. ����. 3. īī�� 4. ������");
			index = sc.nextInt();
			
			if(index == 4) {break;}
//			�ε����� �� �Ŷ� 1�� ���ش�.
			index--;
			
			System.out.println("���� ����: 1. ���°���\n 2. �Ա��ϱ�\n 3. ����ϱ�\n 4. ������ȸ\n 5. ���¹�ȣ ã��\n 6. ����ٽü���");
			serviceChoice = sc.nextInt();
			
			switch(serviceChoice) {
//			���°���
			case 1:
				arBank = new Bank[] {new ShinHan(), new KB(), new Kakao()};
				
				while(true) {
//					���¹�ȣ ����
					System.out.println("������ �Է�: ");
					String name = sc.next();
					System.out.println("�ڵ��� ��ȣ �Է�");
					String phoneNumber = sc.next();
					System.out.println("��й�ȣ �Է�: ");
					String password = sc.next();
					
//					���»����޼ҵ�
					user.accountCreate(name, phoneNumber, password);
//					�����Ѱ� arrBank�� �ֱ�
					arrBank[index][arCount[index]] = user;
					
//					�ߺ�üũ
					
					
				}
			}
			
		}
		
		
	}
}
