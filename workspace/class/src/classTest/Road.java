package classTest;

class Car{
//	�귣��
	String brand;
//	����
	String color;
//	����
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
	
//	�õ��ѱ�(�귣�� �õ� �ѱ�)
	void turnOnCar(){
		System.out.println(this.brand + " �õ� �ѱ�");
	}
//	�õ�����(�귣�� �õ� �ѱ�)
	void turnOffCar(){
		System.out.println(this.brand + " �õ� ����");
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
