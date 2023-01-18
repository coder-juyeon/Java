package bankTest;

import java.util.Random;

public class Bank {
	private String accountHolder; //������
	private String accountNum = ""; //���¹�ȣ
	private String phoneNum; //�ڵ�����ȣ
	private String password; //��й�ȣ
	private int accountBalance; //�����ܰ�
	
	public Bank() {
	}
	
//	getter,setter
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	
//	���
//	����� �ݾװ� ��й�ȣ�� �Ű������� �ް�
//	��й�ȣ�� �¾ƾ� ����� �����ϴ�. -> ����O
//	�ܰ��� ����� �ݾ��� ����
//	�ܰ� ����
//	����� �Ϸ��� �ܰ��� ���ų� ���� money���߸� �Ѵ�. -> ����O
	public int withDraw(int money) {
		this.accountBalance -= money;
		return accountBalance;
	}
	
//	int withDraw(String pW, int money){
//		if(this.password == pW) {
//			if(money <= accountBalance) {
//				this.accountBalance -= money;
//			}
//	����� �ݾ��� �� ũ�� �״�� �ܰ� �������ش�.
//	ȭ�鿡�� ����.
//			else{
//				System.out.println("�ܰ� �����մϴ�.");
//				return this.accountBalance;
//			}
//		}
//		else {
//			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
//		}
//		return accountBalance;
//	}
	

	//	�Ա�
//	�Աݱݾ��� �Ű������� �ް�
//	�ܰ� �Աݱݾ��� �����ش�.
	int deposit(int money){
		this.accountBalance += money;
		return accountBalance;
	}
	
//	�ܾ���ȸ
	int balanceCheck() {
		return accountBalance;
	}
	
//	���°���
//	�̸��� �ڵ�����ȣ ��й�ȣ�� �Ű������� �޴´�.
	void accountCreate(String name, String phoneNum, String pW) {
		Random random = new Random();
		
//		������ ����
		setAccountHolder(name);
//		�ڵ�����ȣ ����
		setPhoneNum(phoneNum);
//		��й�ȣ ����
		setPassword(pW);
//		�����ܰ�� ��������̹Ƿ� �̹� 0���� �ʱ�ȭ�� �Ǿ��� ������ ��������
		
//		���¹�ȣ ����
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = random.nextInt(10);
			this.accountNum += num[i];
		}
	}
	
//	���¹�ȣ �ߺ��˻�
//	char.At(i) ���� �迭�� �����µ�
//	6�ڸ��� ��� �ߺ��̸� �ߺ�
//	���ڸ��� �ٸ��� �ߺ��ƴ�
//	ī��Ʈ������ 6���� ��� �� �ߺ��ΰŴϱ� result false
//	boolean accountNumCheck(String accountNum){
//		int count = 0;
//		boolean result = true;
//		for (int i = 0; i < 6; i++) {
//			if(accountNum.charAt(i) == this.accountNum.charAt(i)) {
//				count++;
//			}
//			else {;}
//		}
//		if(count == 6) {
//			result = false;
//		}
//		else {;}
//		return result;
//	}
	
//	�ٵ� �Ű������� �迭�� �Ǿߵ� �ֳĸ� Ŭ������ ��ü�� ����� ���ؼ��� Ŭ������ �޾ƾ� �ϱ� ����
//	�ٵ� Ŭ������ �ϳ��� �ƴϴϱ� �迭�� �޾ƾߵ�
//	���� �̷��� �Ѵٸ� �Ű������� �迭�� �� �� ����
//	�ٸ� �ڵ带 ¥�ߵ�
//	�̷������� ��ü�� ������ ��
//	int[][] arrBank = new int[3][100];
	public Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank result = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccountNum().equals(account)) {
					result = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {break;}
			
		}
		return result;
	}
	
//	�ڵ��� ��ȣ �ߺ��˻� ����
//	���¹�ȣ �ߺ��˻�� ���� ����
	public static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNum().equals(phoneNumber)) {
					bank = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	�α���
//	�Է°��¹�ȣ�� �Էº�й�ȣ �ΰ��� �Ű������� �ް�
//	�Է��� ���¹�ȣ && �Է��� ��й�ȣ �ΰ��� ������ ��
//	check ������ �ְ� check�� true�� result�� true�� ��ȯ 
	public Bank login(Bank[][] bank, int[] arCount ,String accountNum, String pW){
		Bank user = checkAccount(bank, arCount, accountNum);
//		�ߺ��˻綧 �̰� null�� �ƴϸ� �ߺ��̶�� �� �״ϱ� ���°� �ִٴ� ���ݾ�
//		�׷� ���� ������ ���´� ���� �� ���ص� �Ǵϱ� �н����常 ������ ���ϸ� ���� �Ϳ� 
		if(user != null) {
			user.getPassword().equals(pW);
			return user;
		}
		return null;
	}
//	���� �����ϴ� DB�� 2���� �迭�� ����
//	Bank[][] 	
//	Bank[][] arrBank = new Bank[3][100];
	
//	{�����̸�}{�� ���� �ʵ�}
	
}
