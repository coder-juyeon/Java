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
	
//	입금
	public void deposit(int money) {
		this.money += money;
	}
	
//	출금
	public void withdraw(int money) {
		this.money -= money;
	}
	
//	잔액 조회
	public int showBalance() {
		return money;
	}
	
<<<<<<< HEAD
//	계좌번호 중복검사
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) {
=======
//	클래스의 배열 이해하기
//	int변수 열 개가 필요하면 열칸짜리 int 배열을 만들듯이,
//	Bank객체 열개가 필요하면 열칸짜리 Bank배열을 만들어서 담아 주면 되는 것
//	arrBank라는 변수 안에 [Bank클래스 ][Bank클래스 ] -> 이렇게 들어있는 것
//	[Bank 필드][Bank 필드]

//	계좌번호 중복검사
//	중복검사에서만 쓰는것이 아닌 로그인에서도 쓸 수 있게 계좌번호를 리턴하게 만든다.
//	Bank 클래스를 2차원 배열로 arrBank 선언
//	arCount -> 은행별 객체 갯수 
//	account -> 계좌번호
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
//		Bank타입의 변수를 만들고
		Bank bank = null;
//		arrData.length(행의 길이)
//		arrData[행].length(열의 길이)
//		arrBank의 행 길이만큼 i번 도는데
		for (int i = 0; i < arrBank.length; i++) {
//		은행별 객체 수만큼 -> new 해서 만들어진 객체 수만큼 돌아
//		i=0 j=0 this.account 가 매개변수 account와 같다면 
//		bank변수 안에 arrBank[0][0] -> 예를들어 신한의 첫번째 객체인거지	-> break
//		j arCount[i] 다르면 브레이크	
//		arCount는 객체 개수 -> 객체 개수를 다 안돌았으면 나가라
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
//			j가 절대 arCount[i]까지 못가
>>>>>>> f8ab6cea60ec128b3d19fff2feb1dafd5cef60ed
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	핸드폰 번호 중복 검사
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
	
//	로그인
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












