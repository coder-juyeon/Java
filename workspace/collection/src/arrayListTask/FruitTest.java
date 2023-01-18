package arrayListTask;

public class FruitTest {
	public static void main(String[] args) {
		Market market = new Market();
		Fruit apple = new Fruit();
		Fruit pear = new Fruit();
		Fruit orange = new Fruit();
		
		apple.setCost(17900);
		apple.setName("apple");
		
		pear.setCost(20000);
		pear.setName("pear");
		
		orange.setCost(25500);
		orange.setName("orange");
		
		market.fruitAdd(apple);
		market.fruitAdd(pear);
		market.fruitAdd(orange);
		
//		이름 중복검사 테스트
		System.out.println(market.namecheck("apple"));
		
//		과일추가 테스트
		System.out.println(market.fruitAdd(apple));
		
//		과일삭제 테스트
//		System.out.println(market.FruitDelect(apple));
		
//		과일 가격이 평균보다 낮은지 테스트
		System.out.println(market.checkPrice(orange));
		
//		과일 이름으로 가격 조회
		System.out.println(market.findPrice("apple"));
	}
}
