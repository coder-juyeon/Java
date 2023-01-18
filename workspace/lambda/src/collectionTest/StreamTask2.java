package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//      10~1까지 ArrayList에 담고 출력
//		11에서 i를 빼서 i를 증가시켜야됨
		ArrayList<Integer> tenToOne = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach(n -> tenToOne.add(11-n));
//		[]배열 방식으로 출력하고 싶다면
		System.out.println(tenToOne);
//		하나씩 줄바꿈으로 출력하고 싶다면
		tenToOne.stream().forEach(System.out::println);
      
//      1~10까지 ArrayList에 담고 출력
//		i를 1부터 1씩 증가해서 10까지 한 후 ArrayList에 담기
//		출력하기
		ArrayList<Integer> oneToTen = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach(oneToTen::add);
		System.out.println(oneToTen);
      
//      ABCDEF를 각 문자별로 출력
		String aToF= "ABCDEF";
		aToF.chars().forEach(n -> System.out.println((char)n));
      
//      1~100까지 중 홀수만 ArrayList에 담고 출력
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		IntStream.range(1, 51).forEach(n -> oddNum.add(n * 2 -1));
		System.out.println(oddNum);
      
//      A~F까지 중 D제외하고 ArrayList에 담고 출력
//		1A 65 2B 66 3B 67 4C 68 5D 69 6E 79 7F 80
		ArrayList<String> abcef = new ArrayList<String>();
//		aToF.chars().forEach(n -> abcef.add());
		
		
//      5개의 문자열을 모두 소문자로 변경(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//            
//      1~100까지 중 홀수만 ArrayList에 담고 출력
//      
//      Apple, banana, Melon 중 첫번째 문자가 대문자인 문자열 출력
      
//      한글을 정수로 변경
//      정수를 한글로 변경
	}
}
