package arrayListTask2;

public class FoodTest {
	public static void main(String[] args) {
		Food pizza = new Food();
		Food chicken = new Food();
		Food hamburger = new Food();
		Food gukbap = new Food();
		Restaurant restaurant = new Restaurant();
		
//		����ڰ� ���ϴ� ������ ���� ��ü ��ȸ �׽�Ʈ
		pizza.setCost(18000);
		pizza.setKind("���");
		pizza.setName("����");
		restaurant.FoodAdd(pizza);
		
		chicken.setCost(20000);
		chicken.setKind("���");
		chicken.setName("ġŲ");
		restaurant.FoodAdd(chicken);
		
		hamburger.setCost(6000);
		hamburger.setKind("���");
		hamburger.setName("�ܹ���");
		restaurant.FoodAdd(hamburger);
		
		gukbap.setCost(8000);
		gukbap.setKind("�ѽ�");
		gukbap.setName("����");
		restaurant.FoodAdd(gukbap);
		
		System.out.println(restaurant.findFood("���"));
		
//		���� ���� ���� �� ���� 10% ��� �׽�Ʈ
		restaurant.setKind("ġŲ", "�ѽ�");
		System.out.println("����� ġŲ ����: ");
		System.out.println(chicken.getKind());
		System.out.println(chicken.getCost());
		
//		����ڰ� ���ϴ� ������ ���� ���� ��ȸ �׽�Ʈ
		System.out.println(restaurant.foodCount("���"));
		
	}

}
