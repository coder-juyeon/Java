package test1;

import java.util.Iterator;

public class MyMethod {
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
	public static void main(String[] args) {
//		���ڿ��� �Է¹ް� ���ϴ� ������ ������ �����ִ� �޼ҵ�
		MyMethod myMethod = new MyMethod();
		int data = myMethod.getCount("���̽̽�īŸ����Ÿ", 'Ÿ');
		System.out.println(data);
	}
}
