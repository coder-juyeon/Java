package methodTest;

import java.util.Scanner;

public class MethodTask {
//		1~10���� println()���� ����ϴ� �޼ҵ�
	void print(){
		for (int i = 0; i < 10; i++) {
			int result = i + 1;
			System.out.println(result);
		}
	}
	
//		"ȫ�浿"�� n�� println()���� ����ϴ� �޼ҵ�
	void getPrint(int n) {
		String name = "ȫ�浿";
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//		�̸��� n�� println()���� ����ϴ� �޼ҵ�
	void getNamePrint(String name, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(name);
		}
	}
	
//		�� ������ ������ ���ִ� �޼ҵ�
	int sub(int num1, int num2, int num3){
		int result = num1 - num2 - num3;
		return result;
	}
	
//	�� ������ ������ �� ��� ������ �� ���� ���ϴ� �޼ҵ�
//	value, rest ��, ������
	int[] div (int num1, int num2){
		int[] result = null;
		
		if(num2 != 0) {
			result = new int[2];
			result[0] = num1 / num2;
			result[1] = num1 % num2;		
		}
		
		return result;
	}
	
//	1~n������ ���� �����ִ� �޼ҵ�
//	int sum(int n){
//		int total = 0;
//		for (int i = 0; i < n; i++) {
//			total += (i+1);
//		}
//		return total;
//	}
	
//	Ȧ���� ¦����, ¦���� Ȧ���� �ٲ��ִ� �޼ҵ�
//	int change1(int num1){
//		num1++;
//		return num1;
//	}
	
//	���ڿ��� �Է¹ް� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ� �ٲ��ִ� �޼ҵ�
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
//	���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
	int getCount(String arData, char c){
		int count = 0;
//		�丶�� �� -> �� ��ֳ�
//		charAt()���� ���ڿ��� �����ϰ�
//		c�� �Ȱ����� ���ؼ�
//		count ������ count�� ���� count ����ϱ�
		for (int i = 0; i < arData.length(); i++) {
			if (arData.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}
	
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
	int getIndex(int[] arData, int num){
		return arData[num];
	}
	

	
//	�ѱ��� ������ �ٲ��ִ� �޼ҵ�(�ϰ��̻� -> 1024)
	int StringToInt(String arData){
		String arString = "�����̻�����ĥ�ȱ�";
		String result = "";
		
		for (int i = 0; i < arData.length(); i++) {
			result += arString.indexOf(arData.charAt(i));
		}
		return Integer.parseInt(result);
	}
//	5���� ������ �Է¹��� �� ���ϴ� �ε����� ���� �����ִ� �޼ҵ�
//	int getIndex(int[] arData, int num){
//		return arData[num];
//	}
	
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�
	int[] getMaxAndMix(int[] arData){
		int[] result = {arData[0], arData[0]};
		for (int i = 1; i < arData.length; i++) {
//			���[0]�� ū ���� �����ž� ���[0]�� arData[1]�� ���� 1�� �� ũ�� ���[0]�� arData[1]�� �Ǵ°���
//			�긦 �ݺ��� arData[2,3,4,5]���� 
			if (result[0] < arData[i]) {
				result[0] = arData[i];
			}
			
			if(result[1] > arData[i]) {
				result[1] = arData[i];
			}
		}
		return result;
	}
//	5���� ������ �Է¹ް� �ִ밪�� �ּҰ��� �����ִ� �޼ҵ�(void) -> ���Ͼ��� �����ض�	
	  void getMaxAndMin(int[] arData, int[] result) {
	      result[0] = arData[0];
	      result[1] = arData[0];
	      
	      for (int i = 0; i < arData.length; i++) {
	         if(result[0] < arData[i]) {result[0] = arData[i];} 
	         if(result[1] > arData[i]) {result[1] = arData[i];} 
	      }
	   }

//	  indexOf()�����
//	  ���ڿ��� ���ڸ� �Է¹��� �� �ش� ���ڰ� �� ��° �ε����� �ִ� �� �˻��ϰ�
//	  ���� �ش� ���ڰ� ������ -1�� �����Ѵ�.
	  
	  int myIndexOf(String st, char ch){
		  int result = 0;
		  for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == ch) {
				result = i;
				break; //�߿�
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
		
		System.out.println(methodTask.myIndexOf("����", '��'));
//		methodTask.print();
//		methodTask.getPrint(4);
//		methodTask.getNamePrint("���ֿ�",3);
//		System.out.println(methodTask.sub(50, 30, 10));
//		int[] result = methodTask.div(10, 0);
//
//		if(result == null) {
//		       System.out.println("0���� ���� �� �����ϴ�.");
//		    }else {
//		       System.out.println("��: " + result[0]);
//		       System.out.println("������: " + result[1]);
//		    }
		
//		1��
//		System.out.println(methodTask.sum(7));
		
//		2��
//		System.out.println(methodTask.change1(4));String result = null;
//		System.out.println(methodTask.stringChange("EdTt"));
		
//		3��
//		System.out.println(methodTask.getIndex(3, 5, 3, 9, 10, 3));
		
//		4��
//		int data = methodTask.getCount("���̽̽�īŸ����Ÿ", 'Ÿ');
//		System.out.println(data);
		
//		5��
//		int[] arData = {3, 7, 9, 3, 4, 6};
//		System.out.println(methodTask.getIndex(arData, 2));
	
//		6��
//		System.out.print(methodTask.StringToInt("��������"));
		
//		7��
//		int[] arData = {3, 7, 9, 3, 4, 6};
//		System.out.println(methodTask.getIndex(arData, 2));
	
//		8��
//		int[] array = {70, 30, 90, 32, 40};
//		
//		System.out.println("�ִ�");
//		System.out.println(methodTask.getMaxAndMix(array)[0]);
//		System.out.println("�ּڰ�");
//		System.out.println(methodTask.getMaxAndMix(array)[1]);
	}
}
	

