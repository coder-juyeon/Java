package bankTest;

public class KB extends Bank{
	int commission = 0; //수수료
	int comPercent = 50; //수수료 퍼센트
	
	@Override
	public int withDraw(int money) {
		commission += money * (comPercent / 100.0);
		money -= commission; 
		return super.withDraw(money);
	}
}
