package arrayListTask2;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = FoodDBConnecter.foods;

//	���� �߰�
	public void FoodAdd(Food food) {
		foods.add(food);
	}

//	���� �̸����� ���� ���� ��ȸ
	public String findKind(String name) {
		String result = null;
		for (Food food : foods) {
			if (food.getName().equals(name)) {
				result = food.getKind();
				break;
			}
		}
		return result;
	}

//	����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
	public String findFood(String kind) {
		String result = "";
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				result += food.getName();
			}
		}
		return result;
	}
	
//	���� ���� ���� �� ���� 10% ���
//	���� ��ü�� ������ �����ϸ� �� ������ ���� ���
//	�Ű����� �ΰ� (�����̸�, �ٲ�����)
	public void setKind(String name, String kind) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				food.setKind(kind);
//				���� 10% ��� -> ���� * 1.1 
				
				int price = (int)(food.getCost() * 1.1);
				food.setCost(price);
			}
		}
	}
	
//	����ڰ� ���ϴ� ������ ���� ���� ��ȸ
		public int foodCount(String kind) {
			int count = 0;
			for (Food food : foods) {
				if(food.getKind().equals(kind)) {
					count++;
				}
			}
			return count;
		}
	}

