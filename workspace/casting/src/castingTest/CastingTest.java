package castingTest;

class Car {
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}


class SuperCar extends Car {
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("지붕 열기");
	}
}

public class CastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
//		up casting
		Car noOptionFerrari = new SuperCar();
		
//		SuperCar brokenFerrari = (SuperCar)new Car();
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
//      matiz instanceof Car : true
      System.out.println(matiz instanceof Car);
      
//      matiz instanceof SuperCar : false
      System.out.println(matiz instanceof SuperCar);
      
//      ferrari instanceof Car : true
      System.out.println(ferrari instanceof Car);
      
//      ferrari instanceof SuperCar : true
      System.out.println(ferrari instanceof SuperCar);
      
//      noOptionFerrari instanceof Car : true
      System.out.println(noOptionFerrari instanceof Car);
      
//      noOptionFerrari instanceof SuperCar : true
      System.out.println(noOptionFerrari instanceof SuperCar);
      
      
//      fullOptionFerrari instanceof Car : true
      System.out.println(fullOptionFerrari instanceof Car);
      
//      fullOptionFerrari instanceof SuperCar : true
      System.out.println(fullOptionFerrari instanceof SuperCar);

//      업캐스팅, 다운캐스팅 된 자식클래스는 부모,자식 타입 두개가 공존한다.
		
	}
}
