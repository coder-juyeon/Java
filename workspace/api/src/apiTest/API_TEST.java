package apiTest;

public class API_TEST {
//	/** + enter -> API 주석
	public static void main(String[] args) {
		Calc calc = new Calc();
		try {
			System.out.println(calc.div(10, 0));
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
	}
}
