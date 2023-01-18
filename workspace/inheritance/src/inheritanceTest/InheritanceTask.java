package inheritanceTest;

class Car {
	String brand;
	String color;
	int price;
	
	public Car() {;} //일부러 비워놓은 코드라는 표시
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끔");
	}
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar(String brand, String color, int price, String mode) {

		super(brand, color, price);
//		this.brand = brand;
//		this.color = color;
//		this.price = price;
		this.mode = mode;
	}
	
//	슈퍼카는 음성으로 시동을 켜고 끌 수 있다.
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("음성으로 시동 킴");
	}
	
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("음성으로 시동 끔");
	}
}

public class InheritanceTask {
	public static void main(String[] args) {

	}
}
