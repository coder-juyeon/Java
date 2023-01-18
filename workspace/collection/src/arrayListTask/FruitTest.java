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
		
//		�̸� �ߺ��˻� �׽�Ʈ
		System.out.println(market.namecheck("apple"));
		
//		�����߰� �׽�Ʈ
		System.out.println(market.fruitAdd(apple));
		
//		���ϻ��� �׽�Ʈ
//		System.out.println(market.FruitDelect(apple));
		
//		���� ������ ��պ��� ������ �׽�Ʈ
		System.out.println(market.checkPrice(orange));
		
//		���� �̸����� ���� ��ȸ
		System.out.println(market.findPrice("apple"));
	}
}
