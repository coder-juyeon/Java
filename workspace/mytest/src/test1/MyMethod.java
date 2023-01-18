package test1;

import java.util.Iterator;

public class MyMethod {
	int getCount(String arData, char c){
		int count = 0;
//		토마토 토 -> 토 몇개있냐
//		charAt()으로 문자열을 추출하고
//		c랑 똑같은지 비교해서
//		count 변수로 count를 세서 count 출력하기
		for (int i = 0; i < arData.length(); i++) {
			if (arData.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
//		문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
		MyMethod myMethod = new MyMethod();
		int data = myMethod.getCount("고고싱싱싱카타리코타", '타');
		System.out.println(data);
	}
}
