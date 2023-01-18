package classTest;

class Company{
	static Long sequence;
	static Long total;
	Long id; //null�� �� �� �ֵ��� Long���� ����
	String name;
	Long salary;
	int income;
	
//	���� ù��° �����ڰ� ������ ����
	static {
		total = 0L;
		sequence = 0L;
	}
	
//	�ʱ�ȭ ���
	{
		id = ++sequence;
	}
	
//	alt + shift + s
	public Company(String name, Long salary) {
		this.name = name;
		this.salary = salary;
	}

	void printMyData() {
		System.out.println(id + ", " + name + ", ��" + salary + "����");
	}
	
}

public class Market1 {
	public static void main(String[] args) {
		Company �ѵ��� = new Company("�ѵ���", 4000L);
		Company ������ = new Company("������", 6000L);
		Company ���¾� = new Company("���¾�", 7000L);
		Company ��� = new Company("���", 10000L);
		
		�ѵ���.printMyData();
		������.printMyData();
		���¾�.printMyData();
		���.printMyData();
		
		Company.total += �ѵ���.income = 1000;
		Company.total += ������.income = 2000;
		Company.total += ���¾�.income = -10000;
		Company.total += ���.income = -10000;
		
		System.out.println(Company.total);
	}
}
