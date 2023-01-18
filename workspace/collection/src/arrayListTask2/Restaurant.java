package arrayListTask2;

import java.util.ArrayList;

public class Restaurant {
	public ArrayList<Food> foods = FoodDBConnecter.foods;

//	음식 추가
	public void FoodAdd(Food food) {
		foods.add(food);
	}

//	음식 이름으로 음식 종류 조회
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

//	사용자가 원하는 종류의 음식 전체 조회
	public String findFood(String kind) {
		String result = "";
		for (Food food : foods) {
			if(food.getKind().equals(kind)) {
				result += food.getName();
			}
		}
		return result;
	}
	
//	음식 종류 수정 후 가격 10% 상승
//	음식 개체의 종류를 수정하면 그 음식의 가격 상승
//	매개변수 두개 (음식이름, 바꿀종류)
	public void setKind(String name, String kind) {
		for (Food food : foods) {
			if(food.getName().equals(name)) {
				food.setKind(kind);
//				가격 10% 상승 -> 가격 * 1.1 
				
				int price = (int)(food.getCost() * 1.1);
				food.setCost(price);
			}
		}
	}
	
//	사용자가 원하는 종류의 음식 개수 조회
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

