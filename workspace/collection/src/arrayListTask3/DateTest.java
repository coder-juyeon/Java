package arrayListTask3;

import java.util.ArrayList;
import java.util.Iterator;

public class DateTest {
	public static void main(String[] args) {
		DateApp dateApp = new DateApp();
		
		Love Hong = new Love();
		Love Kim = new Love();
		Love Lee = new Love();
		Love Park = new Love();
		
		Hong.setAge(25);
		Hong.setName("홍길동");
		Hong.setIndex(1);
		dateApp.addUser(Hong);
		
		
		Kim.setAge(23);
		Kim.setName("김철수");
		Kim.setIndex(2);
		dateApp.addUser(Kim);
		
		Lee.setAge(21);
		Lee.setName("이영희");
		Lee.setIndex(3);
		dateApp.addUser(Lee);
		
		Park.setAge(25);
		Park.setName("박지성");
		Park.setIndex(4);
		dateApp.addUser(Park);
//		사용자가 원하는 나이의 이상형 목록 조회 테스트
		System.out.println(dateApp.ageList(25));
		
//		이상형 나이 순 정렬
		dateApp.sort();
		System.out.println(dateApp.loves);
	}
}
