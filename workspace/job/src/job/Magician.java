package job;
//����â��
//Ȯ��
//�޴� : 1.���ڸ��߱� ���� 2. ��ѱ� ���� 3. �����ϱ�
//������ ������ ���� ���߱�
//���ٿ�
//���߸� �ڼ�Ȯ�� ����
//�ڼ� ������ ��������
//5�� �����߸� ���� ����


//3���� ���� �� ��ѱ� �Ѹ����� ����ִ��� ã��
//���߸� �ڼ�Ȯ�� ����
//3���� ��ȸ
//��ȸ�� ���� �� ���� ����

//���� 3ȸ ���н� ������ ����� �������� (bad ending)
//���� ������ ���� ����, ���� ����ΰ��� �̰͸� ������ ����
//������ ��ŷ�ű��

//�׻� �ּ��ޱ� 
//ȭ�鿡�� �� �Ͱ� �޼ҵ忡�� �� �� �����ϱ�
public class Magician {
	int chance;
	int percent;
	int money;
	int choice;
	int[] rating;
	
	
	public Magician() {}
		
//	����ޱ�
	int getMoney() {
		this.money += 100;
		return money;
	}
	
//	��ǻ�Ͱ� ���� ���� ���� ���߱�
	boolean playGuessInt(int data, int guess){
		boolean check = false;
		if (data > guess) {
			System.out.println("��");
		}
		else if (data < guess) {
			System.out.println("�ٿ�");
		}
		else {
			this.percent += 5;
			check = true;
		}
		return check;
	}
	
//	��ѱ� ���߱�
	boolean playGuessPigeon(int myChoice, int pigeonChoice){
		boolean check = false;
		if (myChoice == pigeonChoice) {
			check = true;
			this.percent += 5;
		}
		else {
			this.chance--;
			
		}
		return check;
	}
}