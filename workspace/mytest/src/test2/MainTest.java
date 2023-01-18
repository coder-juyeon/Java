package test2;

import java.util.Random;

//여러개의 정수를 입력받아서 알맞는 덧셈, 뺄셈 결과를 확인하는 애플리케이션 제작
//음수와 양수 0 도 받아야됨
//사용자가 정수를 입력해야됨
//그 입력한 정수를 Integer.parseInt 로 int로 바꿔주고 (calc 메서드)
//정수들을 더해줌 (음수도 다 더해주면 됨 어차피 음수가 빼기니까) (static 메소드)
//

public class MainTest {
	public static void main(String[] args) {
//		Random random = new Random();
//		String result = "";
//		for (int i = 0; i < 6; i++) {
//			result += random.nextInt(10);
//		}
//		System.out.println(result);
		String data = "서연	1	36,825\r\n"
				+ "서윤	2	36,327\r\n"
				+ "지우	3	31,748\r\n"
				+ "서현	4	29,362\r\n"
				+ "하은	5	28,685\r\n"
				+ "하윤	6	28,645\r\n"
				+ "민서	7	28,024";
		String[] arData = null;
		arData = data.split("\t");
		for (String arDatas : arData) {
			System.out.println(arDatas);
		}
	}

}
