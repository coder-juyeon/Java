package classTest;

class Company1{
	static int sequence;
	static int total;
	int id;
	String name;
	int income;
	
//	�ʱ�ȭ ��
//	������ ȣ��� ������ ����
	{
		this.id = ++sequence;
	}
}
public class Market {
	public static void main(String[] args) {
		Company1 �ѵ��� = new Company1();
		Company1 ������ = new Company1();
		Company1 ���¾� = new Company1();
		Company1 ��� = new Company1();
		

//		Company1.total += �ѵ���.income += 300;
//		Company1.total += ������.income += 300;
//		Company1.total += ���¾�.income += 300;
//		Company1.total += ���.income += 300;
		
		�ѵ���.income += 300;
		������.income += 700;
		���¾�.income += 100;
		���.income += 200;
		
		Company1.total += �ѵ���.income;
		Company1.total += ������.income;
		Company1.total += ���¾�.income;
		Company1.total += ���.income;
		
		
		System.out.println(Company1.total);
	}

}
