package bankTest;

public class KB extends Bank{
	int commission = 0; //������
	int comPercent = 50; //������ �ۼ�Ʈ
	
	@Override
	public int withDraw(int money) {
		commission += money * (comPercent / 100.0);
		money -= commission; 
		return super.withDraw(money);
	}
}
