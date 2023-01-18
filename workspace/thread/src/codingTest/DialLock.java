package codingTest;

public class DialLock {
//	���� ���ݼ��� �ִ� ���� P, ��й�ȣ S -> �Ű�����
//	�ּ� ȸ�� Ƚ���� return �ϴ� solution �Լ� �ϼ�
//	��й�ȣ ����: 1000�ڸ� ������ �ڿ���
	
//	0,1,2,3, <-4 5-> 6,7,8,9
//	4�����̸� ������ 5�� ���� ������� 6�̻��̸� ������
//	�ּ� ȸ�� Ƚ�� ���ϴ¹�
//	�� ���̾� ȸ�� Ƚ���� 20�� �ִ� ���̹Ƿ� 
//	������ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ������ 10, 11, 12, 13, 14, 15, 16, 17, 18, 19
//	�̶�� �����ϰ�
//	��й�ȣ�� ù��° �ڸ��� ���� ���ݼ��� �ִ� ���� ��
	
//	���ݼ� ���ڰ� ������
//	���ݼ� ���ڸ� 10 ���ϰ�
//	���� ���ݼ��� �ִ� ���ڿ� ��й�ȣ�� ���ڸ� ������ 4�����̸� ������ 5�� ���� ������� 6�̻��̸� ������
//	��) ���ݼ� ù��°: 5 -> 15 ��й�ȣ ù��°: 9 15-9 -> 6  ������ (6,7,8,9)
//	��) ���ݼ� ù��°: 0 -> 10 ��й�ȣ ù��°: 8 10-8 -> 2  ������ (9,8)
//	��) ���ݼ� ù��°: 2 -> 12 ��й�ȣ ù��°: 7 12-6 -> 5  ������ (3,4,5,6,7) ������ (1,0,9,8,7)
//	���ݼ� ���� ��й�ȣ �ڸ����� �ʱ�ȭ
	
//	���ݼ� ���ڰ� Ŭ��
//	���� ���ݼ��� �ִ� ���ڿ� ��й�ȣ�� ���ڸ� ������ 4�����̸� ������ 5�� ���� ������� 6�̻��̸� ������
//	��) ���ݼ� ù��°: 8 ��й�ȣ ù��°: 1 8-1 -> 7  ������ (9,0,1)
//	��) ���ݼ� ù��°: 9 ��й�ȣ ù��°: 5 9-5 -> 4 ������ (8,7,6,5)
//	��) ���ݼ� ù��°: 5 ��й�ȣ ù��°: 0 5-0 -> 5 ������, ������ �������
	
//	���ݼ��� ��й�ȣ ���ڰ� ������
//	count 0
	
//	count -> �������϶� 10���� �������� ����
//			�������϶��� ���� �� �������� �ȴ�.
//			��������϶��� 5�� �ȴ�.
//	��) �������: ������ 5 -> 5
//	��) ������: ������ 7 -> 7-4 3
//	��) ������: ������ 2 -> 2
	
//	���� ǥ�� ��)������ = 1 ������ = -1 ������� = 0
	int direction = 0;
	int count = 0;
	
//	count ���ϱ�
	public int countNum(int sub) {
		int count = 0;
		if(sub <= 4) {
			direction = -1;
			count = sub;
		}
		else if(sub >= 6) {
			direction = 1;
			count = 10 - sub;
		}
		else {
			direction = 0;
			count = 5;
		}
		System.out.println("����: "+ direction);
		System.out.println("ī��Ʈ: "+ count);
		return count;
	}
	
//	��й�ȣ�� ù��° �ڸ��� ���� ���ݼ��� �ִ� ���� ��
	public int solution(int p ,String s) {
		for (int i = 0; i < s.length(); i++) {
			int sNum = s.charAt(i) - '0';
			System.out.println("���� ���ݼ� ����: " + p);
			System.out.println("��й�ȣ" + (i+1) + "��° ��: " + sNum);
			
			if(p < sNum) {
				p += 10;
				int sub = p - sNum;
				count += countNum(sub);
				p = sNum;
			}
			
			else if(p > sNum) {
				int sub2 = p - sNum;
				count += countNum(sub2);
				p = sNum;
			}
			
			else {
				count += 0;
				p = sNum;
				System.out.println("���� ���� �����̹Ƿ� ȸ������ �ʽ��ϴ�.(count ����X)");
			}
			
			System.out.println("ī��Ʈ �հ�: " + count);
			System.out.println("--------------");
		}
		return count;
	}
	
	public static void main(String[] args) {
		DialLock dialLock = new DialLock();
		int result= 0;

		result = dialLock.solution(9, "8193034");
		System.out.println("ī��Ʈ �� �հ�: " + result);
		
		
	}
	
//	����� �ڵ�
//	public int solution(String p, String s) {
//	      int answer = 0;
//	      
//	      for (int i = 0; i < s.length(); i++) {
//	         int number = p.charAt(i), target = s.charAt(i), result = target - number;
//	         answer += Math.abs(result) > 4 ? 10 - result : Math.abs(result);
//	      }
//	      return answer;
//	   }
}
