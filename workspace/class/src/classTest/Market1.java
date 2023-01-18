package classTest;

class Company{
	static Long sequence;
	static Long total;
	Long id; //null이 들어갈 수 있도록 Long으로 선언
	String name;
	Long salary;
	int income;
	
//	제일 첫번째 생성자가 생성될 때만
	static {
		total = 0L;
		sequence = 0L;
	}
	
//	초기화 블록
	{
		id = ++sequence;
	}
	
//	alt + shift + s
	public Company(String name, Long salary) {
		this.name = name;
		this.salary = salary;
	}

	void printMyData() {
		System.out.println(id + ", " + name + ", 연" + salary + "만원");
	}
	
}

public class Market1 {
	public static void main(String[] args) {
		Company 한동석 = new Company("한동석", 4000L);
		Company 정유찬 = new Company("정유찬", 6000L);
		Company 오태양 = new Company("오태양", 7000L);
		Company 김욱성 = new Company("김욱성", 10000L);
		
		한동석.printMyData();
		정유찬.printMyData();
		오태양.printMyData();
		김욱성.printMyData();
		
		Company.total += 한동석.income = 1000;
		Company.total += 정유찬.income = 2000;
		Company.total += 오태양.income = -10000;
		Company.total += 김욱성.income = -10000;
		
		System.out.println(Company.total);
	}
}
