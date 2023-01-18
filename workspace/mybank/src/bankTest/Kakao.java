package bankTest;

public class Kakao extends Bank{
	
	@Override
	int balanceCheck() {
		setAccountBalance(getAccountBalance() / 2);
		return super.balanceCheck();
	}
}
