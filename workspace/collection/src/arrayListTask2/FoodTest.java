package arrayListTask2;

public class FoodTest {
	public static void main(String[] args) {
		Food pizza = new Food();
		Food chicken = new Food();
		Food hamburger = new Food();
		Food gukbap = new Food();
		Restaurant restaurant = new Restaurant();
		
//		사용자가 원하는 종류의 음식 전체 조회 테스트
		pizza.setCost(18000);
		pizza.setKind("양식");
		pizza.setName("피자");
		restaurant.FoodAdd(pizza);
		
		chicken.setCost(20000);
		chicken.setKind("양식");
		chicken.setName("치킨");
		restaurant.FoodAdd(chicken);
		
		hamburger.setCost(6000);
		hamburger.setKind("양식");
		hamburger.setName("햄버거");
		restaurant.FoodAdd(hamburger);
		
		gukbap.setCost(8000);
		gukbap.setKind("한식");
		gukbap.setName("국밥");
		restaurant.FoodAdd(gukbap);
		
		System.out.println(restaurant.findFood("양식"));
		
//		음식 종류 수정 후 가격 10% 상승 테스트
		restaurant.setKind("치킨", "한식");
		System.out.println("변경된 치킨 종류: ");
		System.out.println(chicken.getKind());
		System.out.println(chicken.getCost());
		
//		사용자가 원하는 종류의 음식 개수 조회 테스트
		System.out.println(restaurant.foodCount("양식"));
		
	}

}
