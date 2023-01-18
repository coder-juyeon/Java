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
	
//	할인가격 = 가격 - (가격 * 할인율 * 0.01)
	int sell(Customer customer) {
		int salePrice = (int)(price * (1.0 - customer.saleRatio / 100.0));
		if(stock > 0 && salePrice <= customer.money) {
			customer.money -= salePrice;
		}
		else {
			System.out.println(salePrice);
			System.out.println("재고가 없거나 고객님의 잔액이 부족해서 팔 수 없습니다.");
		}
		stock--;
		return salePrice;
	}
	
}

//강사님 코드
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
