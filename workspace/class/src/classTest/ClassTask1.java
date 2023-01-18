package classTest;

class SuperCar{
//	브랜드, 색상 가격
	String brand;
	String color;
	String password;
	int price;
	int wrongCount;
	
	{
		password = "0000";
	}
//	엔진 상태
	boolean check;
	
//	생성자
	public SuperCar() {
		
	}
	
	SuperCar(String brand, String color, int price, String password){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
//	시동 켜기
//	엔진 상태를 확인하고
//	시동이 꺼져있다면, "시동 켜기" 출력
//	이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
	boolean startEngine(){
		if(!check) {
	         check = true;
	         return true;
	      }
	      return false;
	}

//	시동 끄기
//	엔진 상태를 확인하고
//	시동이 켜져있다면 "시동 끄기" 출력
//	이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력
	
	boolean endEngine() {
		if(check) {
			check = false;
			return true;
		}
		return false;
	}
//	시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
//	3번 연속 잘못 입력했을 시 "경찰 출동" 출력
//	문자열 비교는  ==이 아닌 .equals()로 해주기
	
	boolean checkPassword(String password) {
		return this.password.equals(password);
	}
	
}


public class ClassTask1 {
	public static void main(String[] args) {
		SuperCar 김주연 = new SuperCar("ben", "black", 6000, "1234");
		김주연.endEngine();
		김주연.startEngine();
		김주연.endEngine();
		김주연.endEngine();
		김주연.startEngine();
		김주연.startEngine();
		
		
	}
}

