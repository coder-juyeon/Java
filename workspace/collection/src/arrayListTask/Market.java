package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
	
//	�̸� �ߺ��˻�
//	�ߺ��̸� �̸���ȯ �ߺ� �ƴϸ� null
	public Fruit namecheck(String name) {
		Fruit result = null;
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {;
				result = fruit;
			}
		}
		return result;
	}
	
//	���� �߰�
//	�ٵ� �̸� �ߺ� ����� ��
	public Fruit fruitAdd(Fruit fruit) {
		if(namecheck(fruit.getName()) == null) {
			fruits.add(fruit);
		}
		return fruit;
	}
	
//	���� ����
//	�̸����� �ޱ�
	public void FruitDelect(Fruit name) {
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				fruits.remove(fruit);
			}
		}
	}
	
//	���� ������ ��� ���ݺ��� ���� �� �˻�
//	�Ű������� ������ �ް�
//	for������ ���ϰ�ü�� ������ ���� ���� ���ѵ� ����� ���Ѵ�.
//	�Ű������� ���� ���ݰ� ��������̶� ���ؼ� ������ true ������ false
//	������ �����Ŵϱ�
	public boolean checkPrice(Fruit name) {
		int sum = 0;
		double avg = 0.0;
		for (Fruit fruit : fruits) {
			sum += fruit.getCost();
			System.out.println("�հ�: " + sum);
		}
		avg = sum / fruits.size();
		System.out.println("���: " + avg);
		boolean result = avg > name.getCost();
		return result;
	}
	
//	���� �̸����� ���� ��ȸ
	public int findPrice(String name) {
		int result = 0;
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				result = fruit.getCost();
			}
		}
		return result;
	}
}
