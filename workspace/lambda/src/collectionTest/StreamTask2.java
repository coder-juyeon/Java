package collectionTest;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class StreamTask2 {
	public static void main(String[] args) {
//      10~1���� ArrayList�� ��� ���
//		11���� i�� ���� i�� �������Ѿߵ�
		ArrayList<Integer> tenToOne = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach(n -> tenToOne.add(11-n));
//		[]�迭 ������� ����ϰ� �ʹٸ�
		System.out.println(tenToOne);
//		�ϳ��� �ٹٲ����� ����ϰ� �ʹٸ�
		tenToOne.stream().forEach(System.out::println);
      
//      1~10���� ArrayList�� ��� ���
//		i�� 1���� 1�� �����ؼ� 10���� �� �� ArrayList�� ���
//		����ϱ�
		ArrayList<Integer> oneToTen = new ArrayList<Integer>();
		IntStream.range(1, 11).forEach(oneToTen::add);
		System.out.println(oneToTen);
      
//      ABCDEF�� �� ���ں��� ���
		String aToF= "ABCDEF";
		aToF.chars().forEach(n -> System.out.println((char)n));
      
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
		ArrayList<Integer> oddNum = new ArrayList<Integer>();
		IntStream.range(1, 51).forEach(n -> oddNum.add(n * 2 -1));
		System.out.println(oddNum);
      
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//		1A 65 2B 66 3B 67 4C 68 5D 69 6E 79 7F 80
		ArrayList<String> abcef = new ArrayList<String>();
//		aToF.chars().forEach(n -> abcef.add());
		
		
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����(Black, WHITE, reD, yeLLow, PINk), toLowerCase()
//            
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//      
//      Apple, banana, Melon �� ù��° ���ڰ� �빮���� ���ڿ� ���
      
//      �ѱ��� ������ ����
//      ������ �ѱ۷� ����
	}
}
