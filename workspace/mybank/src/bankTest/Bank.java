package bankTest;

import java.util.Random;

public class Bank {
	private String accountHolder; //예금주
	private String accountNum = ""; //계좌번호
	private String phoneNum; //핸드폰번호
	private String password; //비밀번호
	private int accountBalance; //통장잔고
	
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

	
//	출금
//	출금할 금액과 비밀번호를 매개변수로 받고
//	비밀번호가 맞아야 출금이 가능하다. -> 구현O
//	잔고에서 출금한 금액을 뺀다
//	잔고 리턴
//	출금을 하려면 잔고보다 같거나 적은 money여야만 한다. -> 구현O
	public int withDraw(int money) {
		this.accountBalance -= money;
		return accountBalance;
	}
	
//	int withDraw(String pW, int money){
//		if(this.password == pW) {
//			if(money <= accountBalance) {
//				this.accountBalance -= money;
//			}
//	출금할 금액이 더 크면 그대로 잔고를 리턴해준다.
//	화면에서 구현.
//			else{
//				System.out.println("잔고가 부족합니다.");
//				return this.accountBalance;
//			}
//		}
//		else {
//			System.out.println("비밀번호가 틀렸습니다.");
//		}
//		return accountBalance;
//	}
	

	//	입금
//	입금금액을 매개변수로 받고
//	잔고에 입금금액을 더해준다.
	int deposit(int money){
		this.accountBalance += money;
		return accountBalance;
	}
	
//	잔액조회
	int balanceCheck() {
		return accountBalance;
	}
	
//	계좌개설
//	이름과 핸드폰번호 비밀번호를 매개변수로 받는다.
	void accountCreate(String name, String phoneNum, String pW) {
		Random random = new Random();
		
//		예금주 생성
		setAccountHolder(name);
//		핸드폰번호 생성
		setPhoneNum(phoneNum);
//		비밀번호 생성
		setPassword(pW);
//		통장잔고는 멤버변수이므로 이미 0으로 초기화가 되었기 때문에 생성안함
		
//		계좌번호 생성
		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = random.nextInt(10);
			this.accountNum += num[i];
		}
	}
	
//	계좌번호 중복검사
//	char.At(i) 으로 배열을 돌리는데
//	6자리가 모두 중복이면 중복
//	한자리라도 다르면 중복아님
//	카운트변수로 6개면 모두 다 중복인거니까 result false
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
	
//	근데 매개변수는 배열이 되야됨 왜냐면 클래스의 객체를 만들기 위해서는 클래스로 받아야 하기 때문
//	근데 클래스는 하나가 아니니까 배열로 받아야됨
//	만약 이렇게 한다면 매개변수에 배열이 들어갈 수 없음
//	다른 코드를 짜야됨
//	이런식으로 객체를 생성할 것
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
	
//	핸드폰 번호 중복검사 서비스
//	계좌번호 중복검사와 같은 로직
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
	
//	로그인
//	입력계좌번호와 입력비밀번호 두개를 매개변수로 받고
//	입력한 계좌번호 && 입력한 비밀번호 두개가 같은지 비교
//	check 변수에 넣고 check가 true면 result도 true로 반환 
	public Bank login(Bank[][] bank, int[] arCount ,String accountNum, String pW){
		Bank user = checkAccount(bank, arCount, accountNum);
//		중복검사때 이게 null이 아니면 중복이라는 뜻 그니까 계좌가 있다는 거잖아
//		그럼 계좌 있으면 계좌는 굳이 비교 안해도 되니까 패스워드만 같은지 비교하면 되지 와우 
		if(user != null) {
			user.getPassword().equals(pW);
			return user;
		}
		return null;
	}
//	고객을 관리하는 DB를 2차원 배열로 선언
//	Bank[][] 	
//	Bank[][] arrBank = new Bank[3][100];
	
//	{은행이름}{그 안의 필드}
	
}
