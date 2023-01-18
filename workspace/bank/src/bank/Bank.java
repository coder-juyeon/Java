package bank;

public class Bank {
	
	private String name;
	private String account;
	private String phoneNumber;
	private String password;
	private int money;
	
	public Bank() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
//	�Ա�
	public void deposit(int money) {
		this.money += money;
	}
	
//	���
	public void withdraw(int money) {
		this.money -= money;
	}
	
//	�ܾ� ��ȸ
	public int showBalance() {
		return money;
	}
	
<<<<<<< HEAD
//	���¹�ȣ �ߺ��˻�
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
=======
//	Ŭ������ �迭 �����ϱ�
//	int���� �� ���� �ʿ��ϸ� ��ĭ¥�� int �迭�� �������,
//	Bank��ü ������ �ʿ��ϸ� ��ĭ¥�� Bank�迭�� ���� ��� �ָ� �Ǵ� ��
//	arrBank��� ���� �ȿ� [BankŬ���� ][BankŬ���� ] -> �̷��� ����ִ� ��
//	[Bank �ʵ�][Bank �ʵ�]

//	���¹�ȣ �ߺ��˻�
//	�ߺ��˻翡���� ���°��� �ƴ� �α��ο����� �� �� �ְ� ���¹�ȣ�� �����ϰ� �����.
//	Bank Ŭ������ 2���� �迭�� arrBank ����
//	arCount -> ���ະ ��ü ���� 
//	account -> ���¹�ȣ
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		BankŸ���� ������ �����
		Bank bank = null;
//		arrData.length(���� ����)
//		arrData[��].length(���� ����)
//		arrBank�� �� ���̸�ŭ i�� ���µ�
		for (int i = 0; i < arrBank.length; i++) {
//		���ະ ��ü ����ŭ -> new �ؼ� ������� ��ü ����ŭ ����
//		i=0 j=0 this.account �� �Ű����� account�� ���ٸ� 
//		bank���� �ȿ� arrBank[0][0] -> ������� ������ ù��° ��ü�ΰ���	-> break
//		j arCount[i] �ٸ��� �극��ũ	
//		arCount�� ��ü ���� -> ��ü ������ �� �ȵ������� ������
>>>>>>> f8ab6cea60ec128b3d19fff2feb1dafd5cef60ed
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getAccount().equals(account)) {
					bank = arrBank[i][j];
					break;
				}
			}
<<<<<<< HEAD
=======
//			j�� ���� arCount[i]���� ����
>>>>>>> f8ab6cea60ec128b3d19fff2feb1dafd5cef60ed
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	�ڵ��� ��ȣ �ߺ� �˻�
	public static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) {
					bank = arrBank[i][j];
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	�α���
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {
			if(user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}
}












