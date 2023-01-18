package classTest;

public class Store {
	String name;
	int price;
	int stock;
	
	public Store() {
		
	}
	
	public Store(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
//	���ΰ��� = ���� - (���� * ������ * 0.01)
	int sell(Customer customer) {
		int salePrice = (int)(price * (1.0 - customer.saleRatio / 100.0));
		if(stock > 0 && salePrice <= customer.money) {
			customer.money -= salePrice;
		}
		else {
			System.out.println(salePrice);
			System.out.println("��� ���ų� ������ �ܾ��� �����ؼ� �� �� �����ϴ�.");
		}
		stock--;
		return salePrice;
	}
	
}

//����� �ڵ�
//package classTest;
//
//public class Shop {
//   String name;
//   int price;
//   int stock;
//   
//   public Shop() {;}
//
//   public Shop(String name, int price, int stock) {
//      this.name = name;
//      this.price = price;
//      this.stock = stock;
//   }
//   
//   int sell(Customer customer) {
//      stock--;
//      int result = (int)(price * (1.0 - customer.discount / 100.0));
//      customer.money -= result;
//      return result;
//   }
//}
