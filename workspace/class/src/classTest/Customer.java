package classTest;

public class Customer {
	String name;
	String phoneNumber; //������ String
	int money;
	int saleRatio; //int�� ������ store.sell -> salePrice ����
	
	public Customer() {;}
	
	public Customer(String name, String phoneNumber, int money, int saleRatio) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.money = money;
		this.saleRatio = saleRatio;
	}

}

//����� �ڵ�
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