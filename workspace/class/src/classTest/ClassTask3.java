package classTest;

public class ClassTask3 {
	
//	만약 만원짜리를 customer.ratio가 10%라면 만원 -> 구천원
//	10000 * 0.1 -> 1000
	
	public static void main(String[] args) {
//		Customer 김주연 = new Customer("김주연","010",10000,0.9);
//		Store store = new Store("그램",90000,3);
//		ClassTask3 classTask3 = new ClassTask3();
//		
//		store.sell(김주연);
//		
//		System.out.println(김주연.money);
		
		Customer[] customer = {new Customer("김주연", "01012345678", 40000, 60),
				new Customer("톰", "000134012",50000, 30)};
		Store store = new Store("gram", 90000, 2);
		
		for (int i = 0; i < customer.length; i++) {
			
			System.out.println("당신의 이름:" + customer[i].name);
			System.out.println("보유한 돈: " + customer[i].money);
			System.out.println("당신의 할인률: " + customer[i].saleRatio);
			
			System.out.println("상품이름: " + store.name);
			System.out.println("상품원가: " + store.price);
			
			System.out.print("당신의 할인률에 따른 할인된 가격: ");
			System.out.println(store.sell(customer[i]));
			
			System.out.println("사고 남은돈: " + customer[i].money);
			
		}
		
		
		
	}
}
