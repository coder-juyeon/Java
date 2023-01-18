package arrayListTask3;

import java.util.ArrayList;
import java.util.Collections;

public class DateApp {
	Love love = new Love();
	ArrayList<Love> loves = DateDBConnecter.loves;
	
//	사용자 담기
	public void addUser(Love love) {
		loves.add(love);
	}
	
//	사용자가 원하는 나이의 이상형 목록 조회
//	원하는 나이를 입력받고
//	나이가 같은 개체를 받아준다.
	public ArrayList<Love> ageList(int age) {
		ArrayList<Love> list = new ArrayList<Love>();
		for (Love love : loves) {
			if(love.getAge() == age){
				list.add(love);
			}
		}
		return list;
	}
	
	
//	이상형의 나이 수정
//	입력한 번호와 DB의 번호가 같으면
//	DB 나이를 입력한 나이로 바꾸기
	public void updateAge(Love love) {
		for (Love loveInDB : loves) {
			if(loveInDB.getIndex() == love.getIndex()) {
				loveInDB.setAge(love.getAge());
			}
		}
	}
	
	
//	이상형 나이 순 정렬
//	public void orderByAge() {
////		이상형들의 나이만 담을 자료구조
//		ArrayList<Integer> arData = new ArrayList<Integer>();
//		for (int i = 0; i < loves.size(); i++) {
//			arData.add(i, loves.get(i).getAge());
//		}
////		오름차순으로 정렬
//		Collections.sort(arData);
//		
////		DB에 있는 이상형들을 나이 순으로 정렬한 결과
//		ArrayList<Love> results = new ArrayList<Love>();
//		
//		for (Love love : results) {
//			
//		}
//	}
	public void sort() {
//      DB에 있는 이상형들을 나이 순으로 정렬한 결과
      ArrayList<Love> results = new ArrayList<Love>();
      
//      이상형들의 나이만 담을 자료구조
      ArrayList<Integer> ages = new ArrayList<Integer>();
      
//      loves에서 나이를 가져와서 ages에 추가
      for (Love love : loves) {
         ages.add(love.getAge());
      }
      
//      오름차순으로 정렬
      Collections.sort(ages);
      
      for (int age : ages) {
         for (int i=0; i<loves.size(); i++) {
            if(loves.get(i).getAge() == age) {
               results.add(loves.get(i));
//               중복이 되는건 리턴해주면 안되니까 쓴거는 비교 대상에서 아예 빼버리기
               loves.remove(loves.get(i));
            }
         }
      }
      loves = results;
   }
}
