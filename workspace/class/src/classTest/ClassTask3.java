package classTest;

public class ClassTask3 {
	
//	���� ����¥���� customer.ratio�� 10%��� ���� -> ��õ��
//	10000 * 0.1 -> 1000
	
	public static void main(String[] args) {
//		Customer ���ֿ� = new Customer("���ֿ�","010",10000,0.9);
//		Store store = new Store("�׷�",90000,3);
//		ClassTask3 classTask3 = new ClassTask3();
//		
//		store.sell(���ֿ�);
//		
//		System.out.println(���ֿ�.money);
		
		Customer[] customer = {new Customer("���ֿ�", "01012345678", 40000, 60),
				new Customer("��", "000134012",50000, 30)};
		Store store = new Store("gram", 90000, 2);
		
		for (int i = 0; i < customer.length; i++) {
			
			System.out.println("����� �̸�:" + customer[i].name);
			System.out.println("������ ��: " + customer[i].money);
			System.out.println("����� ���η�: " + customer[i].saleRatio);
			
			System.out.println("��ǰ�̸�: " + store.name);
			System.out.println("��ǰ����: " + store.price);
			
			System.out.print("����� ���η��� ���� ���ε� ����: ");
			System.out.println(store.sell(customer[i]));
			
			System.out.println("��� ������: " + customer[i].money);
			
		}
		
		
		
	}
}
