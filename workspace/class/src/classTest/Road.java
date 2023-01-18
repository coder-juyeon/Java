package classTest;

class Car{
//	브랜드
	String brand;
//	색상
	String color;
//	가격
	int cost;
	
	Car(String brand, String color, int cost){
		this.brand = brand;
		this.color = color;
		this.cost = cost;
	}
	
	public Car(String color, int cost) {
		this.color = color;
		this.cost = cost;
	}
	
//	시동켜기(브랜드 시동 켜기)
	void turnOnCar(){
		System.out.println(this.brand + " 시동 켜기");
	}
//	시동끄기(브랜드 시동 켜기)
	void turnOffCar(){
		System.out.println(this.brand + " 시동 끄기");
	}
}

public class Road {
	public static void main(String[] args) {
		Car myCar = new Car("KIA","Black",3000);
		Car dadCar = new Car("Red", 6000);
//		myCar.brand = "KIA";
//		myCar.color = "Black";
//		myCar.cost = 3000;
		
		myCar.turnOnCar();
		myCar.turnOffCar();
		
		dadCar.turnOnCar();
		dadCar.turnOffCar();
		
	}

}
