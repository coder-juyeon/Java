package bankTest;

public class ShinHan extends Bank{
	int commission = 0; //������
	int comPercent = 50; //������ �ۼ�Ʈ

//	������ �Ա� �� ������ 50%�� ������
//	�Ա� �� �����Ḧ ���� �Աݵ�

	@Override
	int deposit(int money) {
		commission += money * (comPercent / 100.0);
		money -= commission; 
		return super.deposit(money);
	}
	
	public static void main(String[] args) {
//		ShinHan shinHan = new ShinHan();
//		shinHan.accountHolder = "���ֿ�";
//		shinHan.accountNum = "123456";
//		shinHan.password = "0000";
//		shinHan.phoneNum = "01012345678";
//		
//		System.out.println(shinHan.deposit(10000));
//		System.out.println("����� ���� �ܰ�: ");
//		System.out.println(shinHan.accountBalance);
	}
}
