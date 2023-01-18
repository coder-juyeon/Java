package bankTest;

public class ShinHan extends Bank{
	int commission = 0; //수수료
	int comPercent = 50; //수수료 퍼센트

//	신한은 입금 시 수수료 50%를 내야함
//	입금 시 수수료를 빼고 입금됨

	@Override
	int deposit(int money) {
		commission += money * (comPercent / 100.0);
		money -= commission; 
		return super.deposit(money);
	}
	
	public static void main(String[] args) {
//		ShinHan shinHan = new ShinHan();
//		shinHan.accountHolder = "김주연";
//		shinHan.accountNum = "123456";
//		shinHan.password = "0000";
//		shinHan.phoneNum = "01012345678";
//		
//		System.out.println(shinHan.deposit(10000));
//		System.out.println("당신의 통장 잔고: ");
//		System.out.println(shinHan.accountBalance);
	}
}
