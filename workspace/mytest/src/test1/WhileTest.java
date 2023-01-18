package test1;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
//      심리 테스트
      /*
       * Q. 당신이 좋아하는 색을 선택하세요.
       * 1. 빨간색
       * 2. 노란색
       * 3. 검은색
       * 4. 흰색
       * 5. 나가기
       * 빨간색 : 불같고 열정적이고 적극적이다.
       * 노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
       * 검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
       * 흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
       * 
       * while문을 사용하여 사용자가 5번을 선택할 때 종료시키기
       */
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String question = "당신이 좋아하는 색의 번호를 선택하세요: ";
		String menu = "1.빨간색 \n2.노란색\n 3.검은색\n 4.흰색\n 5.나가기";
		String red = "불같고 열정적이고 적극적이다.";
		String yellow = "발랄하고 밝고 귀엽고 개성있고 착하다.";
		String black = "묵묵하고 든든하고 냉철하고 멋지다.";
		String white = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
		String byemsg = "종료합니다.";
		String errormsg = "잘못 입력하셨습니다. 다시 입력하세요.";
		String result = null;
		
		while (num != 5) {
			System.out.println(question);
			System.out.println(menu);
			
			num = sc.nextInt();
			
			switch(num){
			case 1 :
				result = red;
				break;
			case 2 :
				result = yellow;
				break;
			case 3 :
				result = black;
				break;
			case 4 :
				result = white;
				break;
			case 5 :
				result = byemsg;
				break;
			default :
				result = errormsg;
				break;
			}
			System.out.println(result);
			if (num == 5) {
				break;
			}
			
		}
	}
}
