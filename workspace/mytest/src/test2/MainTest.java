package test2;

import java.util.Random;

//�������� ������ �Է¹޾Ƽ� �˸´� ����, ���� ����� Ȯ���ϴ� ���ø����̼� ����
//������ ��� 0 �� �޾ƾߵ�
//����ڰ� ������ �Է��ؾߵ�
//�� �Է��� ������ Integer.parseInt �� int�� �ٲ��ְ� (calc �޼���)
//�������� ������ (������ �� �����ָ� �� ������ ������ ����ϱ�) (static �޼ҵ�)
//

public class MainTest {
	public static void main(String[] args) {
//		Random random = new Random();
//		String result = "";
//		for (int i = 0; i < 6; i++) {
//			result += random.nextInt(10);
//		}
//		System.out.println(result);
		String data = "����	1	36,825\r\n"
				+ "����	2	36,327\r\n"
				+ "����	3	31,748\r\n"
				+ "����	4	29,362\r\n"
				+ "����	5	28,685\r\n"
				+ "����	6	28,645\r\n"
				+ "�μ�	7	28,024";
		String[] arData = null;
		arData = data.split("\t");
		for (String arDatas : arData) {
			System.out.println(arDatas);
		}
	}

}
