package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

public class Market {
	public ArrayList<Fruit> fruits = DBConnecter.fruits;
	
	
//	이름 중복검사
//	중복이면 이름반환 중복 아니면 null
	public Fruit namecheck(String name) {
		Fruit result = null;
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {;
				result = fruit;
			}
		}
		return result;
	}
	
//	과일 추가
//	근데 이름 중복 없어야 함
	public Fruit fruitAdd(Fruit fruit) {
		if(namecheck(fruit.getName()) == null) {
			fruits.add(fruit);
		}
		return fruit;
	}
	
//	과일 삭제
//	이름으로 받기
	public void FruitDelect(Fruit name) {
		for (Fruit fruit : fruits) {
			if(fruit.getName().equals(name)) {
				fruits.remove(fruit);
			}
		}
	}
	
//	과일 가격이 평균 가격보다 낮은 지 검사
//	매개변수를 과일을 받고
//	for문으로 과일객체를 돌려서 가격 합을 구한뒤 평균을 구한다.
//	매개변수의 과일 가격과 가격평균이랑 비교해서 낮으면 true 높으면 false
//	낮은게 좋은거니까
	public boolean checkPrice(Fruit name) {
		int sum = 0;
		double avg = 0.0;
		for (Fruit fruit : fruits) {
			sum += fruit.getCost();
			System.out.println("합계: " + sum);
		}
		avg = sum / fruits.size();
		System.out.println("평균: " + avg);
		boolean result = avg > name.getCost();
		return result;
	}
	
//	과일 이름으로 가격 조회
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
