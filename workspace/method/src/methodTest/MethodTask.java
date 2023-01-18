package methodTest;

import java.util.Scanner;

public class MethodTask {
//		1~10까지 println()으로 출력하는 메소드
	void print(){
		for (int i = 0; i < 10; i++) {
			int result = i + 1;
			System.out.println(result);
		}
	}
	
//		"홍길동"을 n번 println()으로 출력하는 메소드
	void getPrint(int n) {
		String name = "홍길동";
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//		이름을 n번 println()으로 출력하는 메소드
	void getNamePrint(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//		세 정수의 뺄셈을 해주는 메소드
	int sub(int num1, int num2, int num3){
		int result = num1 - num2 - num3;
		return result;
	}
	
//	두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
//	value, rest 몫, 나머지
	int[] div (int num1, int num2){
		int[] result = null;
		
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;		
		}
		
		return result;
	}
	
//	1~n까지의 합을 구해주는 메소드
//	int sum(int n){
//		int total = 0;
//		for (int i = 0; i < n; i++) {
//			total += (i+1);
//		}
//		return total;
//	}
	
//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//	int change1(int num1){
//		num1++;
//		return num1;
//	}
	
//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
//	String stringChange(String data){
//		String result = "";
//		for (int i = 0; i < data.length(); i++) {
//			char number = data.charAt(i);
//			
//			if(number >= 65 && number <= 90) {
//				number += 32;
//				result += (char)number;
//			}
//			
//			else if(number >= 97 && number <= 122) {
//				number -= 32;
//				result += (char)number;
//			}
//			else {
//				result += data;
//			}
//		}
//		return result;
//	}
//	문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
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
	
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
	int getIndex(int[] arData, int num){
		return arData[num];
	}
	

	
//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024)
	int StringToInt(String arData){
		String arString = "공일이삼사오육칠팔구";
		String result = "";
		
		for (int i = 0; i < arData.length(); i++) {
			result += arString.indexOf(arData.charAt(i));
		}
		return Integer.parseInt(result);
	}
//	5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
//	int getIndex(int[] arData, int num){
//		return arData[num];
//	}
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] getMaxAndMix(int[] arData){
		int[] result = {arData[0], arData[0]};
		for (int i = 1; i < arData.length; i++) {
//			결과[0]에 큰 값을 담을거야 결과[0]과 arData[1]을 비교해 1이 더 크면 결과[0]은 arData[1]이 되는거지
//			얘를 반복해 arData[2,3,4,5]까지 
			if (result[0] < arData[i]) {
				result[0] = arData[i];
			}
			
			if(result[1] > arData[i]) {
				result[1] = arData[i];
			}
		}
		return result;
	}
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void) -> 리턴없이 리턴해라	
	  void getMaxAndMin(int[] arData, int[] result) {
	      result[0] = arData[0];
	      result[1] = arData[0];
	      
	      for (int i = 0; i < arData.length; i++) {
	         if(result[0] < arData[i]) {result[0] = arData[i];} 
	         if(result[1] > arData[i]) {result[1] = arData[i];} 
	      }
	   }

//	  indexOf()만들기
//	  문자열과 문자를 입력받은 뒤 해당 문자가 몇 번째 인덱스에 있는 지 검사하고
//	  만약 해당 문자가 없으면 -1을 리턴한다.
	  
	  int myIndexOf(String st, char ch){
		  int result = 0;
		  for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == ch) {
				result = i;
				break; //중요
//				return result;
			}
			else {
				result = -1;
			}
		}
		  return result;
	  }
	
	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
		
		System.out.println(methodTask.myIndexOf("고고싱", '고'));
//		methodTask.print();
//		methodTask.getPrint(4);
//		methodTask.getNamePrint("김주연",3);
//		System.out.println(methodTask.sub(50, 30, 10));
//		int[] result = methodTask.div(10, 0);
//
//		if(result == null) {
//		       System.out.println("0으로 나눌 수 없습니다.");
//		    }else {
//		       System.out.println("몫: " + result[0]);
//		       System.out.println("나머지: " + result[1]);
//		    }
		
//		1번
//		System.out.println(methodTask.sum(7));
		
//		2번
//		System.out.println(methodTask.change1(4));String result = null;
//		System.out.println(methodTask.stringChange("EdTt"));
		
//		3번
//		System.out.println(methodTask.getIndex(3, 5, 3, 9, 10, 3));
		
//		4번
//		int data = methodTask.getCount("고고싱싱싱카타리코타", '타');
//		System.out.println(data);
		
//		5번
//		int[] arData = {3, 7, 9, 3, 4, 6};
//		System.out.println(methodTask.getIndex(arData, 2));
	
//		6번
//		System.out.print(methodTask.StringToInt("공공삼일"));
		
//		7번
//		int[] arData = {3, 7, 9, 3, 4, 6};
//		System.out.println(methodTask.getIndex(arData, 2));
	
//		8번
//		int[] array = {70, 30, 90, 32, 40};
//		
//		System.out.println("최댓값");
//		System.out.println(methodTask.getMaxAndMix(array)[0]);
//		System.out.println("최솟값");
//		System.out.println(methodTask.getMaxAndMix(array)[1]);
	}
}
	

