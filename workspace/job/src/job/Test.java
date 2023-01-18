package job;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		수익창출
//		확률
//		공연 중 모자 선택해 비둘기 찾기
//		비둘기 찾으면 수당 받음
//		박수 받으면 기회 1 얻음
//		기회가 끝날 시 공연 실패

		
		Scanner sc = new Scanner(System.in);
		Magician m = new Magician();
		Random random = new Random();
		
		m.percent = 70;
		m.chance = 5;
		
		String infoMsg = "환영합니다. 당신은 마술사입니다.\n" 
				+ "당신 앞에는 3개의 모자가 있고 1개의 모자에만 비둘기가 존재합니다.\n"
				+ "비둘기를 찾아 공연을 성공시키고 수익을 내세요.\n"
				+ "관객들을 만족시키면 기회를 얻을 수 있습니다.";
		String menu = "번호를 선택하세요 \n 1. 첫번째모자 2. 두번째모자 3. 세번째모자";
		String successMsg = "쨘 비둘기가 나왔습니다. \n 공연성공";
		String failMsg = "기회를 모두 소진하셨습니다. \n 공연실패";
		String moneyMsg = "수당 100만원을 받았습니다.";
		String clapMsg = "관중들이 만족하여 박수를 칩니다.\n 관중들의 관용으로 기회를 +1 얻으셨습니다.";
		String noClapMsg = "하지만 관중들은 만족하지 못했습니다.";
		String remainCMsg = "남은기회: ";
		String missMsg1 = "비둘기를 찾지 못했습니다.";
		String missMsg2 = "번 모자에 있었습니다.";
		String errorMsg = "잘못입력하셨습니다. 다시 입력해주세요.";
		String myMoneyMsg = "당신이 번 돈은 (단위 만원): ";
	
		System.out.println(infoMsg);
		
//		while (m.chance != 0) {
//			System.out.println(menu);
//			m.choice = sc.nextInt();
////				0~2까지므로 +1을 더해줌
//			m.hatChoice = random.nextInt(3) + 1;
//
//			if (m.choice == m.hatChoice) {
//				System.out.println(successMsg);
//
//				m.getMoney();
//				System.out.println(moneyMsg);
//
//				int[] rating = new int[10];
//				for (int i = 0; i < m.percent / 10; i++) {
//					rating[i] = 1;
//				}
//
//				if (rating[random.nextInt(10)] == 1) {
//					m.chance ++;
//					System.out.println(clapMsg);
//					System.out.println(remainCMsg + m.chance);
//				} else {
//					System.out.println(noClapMsg);
//					System.out.println(remainCMsg + m.chance);
//				}
//				
//			}
//			else if(m.choice > 3 || m.choice < 1) {
//				System.out.println(errorMsg);
//			}
//				
//			else {
//				m.chance--;
//				System.out.println(missMsg1 + m.hatChoice + missMsg2);
//				System.out.println(remainCMsg + m.chance);
//
//			}
//		}
//		System.out.println(failMsg);
//		
//		System.out.println(myMoneyMsg + m.money);
	}
}
