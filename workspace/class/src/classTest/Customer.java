package classTest;

public class Customer {
	String name;
	String phoneNumber; //무조건 String
	int money;
	int saleRatio; //int로 생성시 store.sell -> salePrice 참조
	
	public Customer() {;}
	
	public Customer(String name, String phoneNumber, int money, int saleRatio) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.saleRatio = saleRatio;
	}

}

//강사님 코드
//package classTest;
//
//public class Customer {
//   String name;
//   String phoneNumber;
//   int money;
//   int discount;
//   
//   public Customer() {;}
//
//   public Customer(String name, String phoneNumber, int money, int discount) {
//      this.name = name;
//      this.phoneNumber = phoneNumber;
//      this.money = money;
//      this.discount = discount;
//   }
//}