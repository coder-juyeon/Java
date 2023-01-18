package classTest;

class Company1{
	static int sequence;
	static int total;
	int id;
	String name;
	int income;
	
//	초기화 블럭
//	생성자 호출될 때마다 실행
	{
		this.id = ++sequence;
	}
}
public class Market {
	public static void main(String[] args) {
		Company1 한동석 = new Company1();
		Company1 정유찬 = new Company1();
		Company1 오태양 = new Company1();
		Company1 김욱성 = new Company1();
		

//		Company1.total += 한동석.income += 300;
//		Company1.total += 정유찬.income += 300;
//		Company1.total += 오태양.income += 300;
//		Company1.total += 김욱성.income += 300;
		
		한동석.income += 300;
		정유찬.income += 700;
		오태양.income += 100;
		김욱성.income += 200;
		
		Company1.total += 한동석.income;
		Company1.total += 정유찬.income;
		Company1.total += 오태양.income;
		Company1.total += 김욱성.income;
		
		
		System.out.println(Company1.total);
	}

}
