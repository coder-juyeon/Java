package arrayTest;

import java.util.Scanner;

public class ArTask2 {
	public static void main(String[] args) {
//		각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
//		btn1 : 회원가입 페이지
//		btn2 : 로그인 페이지
//		btn3 : 마이 페이지
		
//		회원가입 -> 로그인 -> 마이 페이지
//		위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누른 경우,
//		이전 단계에 대한 메세지를 출력해준다.
//		예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
		
//		알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//		예) 회원가입 클릭 시, 회원가입 성공
//			마이 페이지 클릭 시, 본인 이름과 나이 출력
		
		Scanner sc = new Scanner(System.in);
		String[] arBtn = {"btn1", "btn2", "btn3"};
		String[] wrongMsg = {"회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요."};
		String[] rightMsg = {"회원가입 성공", "로그인 성공", "김주연, 23살"};
		String endMsg = "종료합니다.";
		String infoMsg = "선택하세요.: ";
		String choice = null;
		int number = 0;
		boolean[] state= {false, false};
		boolean end = true;
		
//		1. -> 2 -> 3->
//		2- > 1-> 3
//		3-> 2->
		
		while(end) {
			for (int i = 0; i < arBtn.length; i++) {
				System.out.print(arBtn[i] + "\t");
			}			
			System.out.print(infoMsg);
			number = sc.nextInt() - 1;
			choice = arBtn[number];
			
			switch(choice) {
			case "btn1":
				System.out.println(rightMsg[0]);
				state[0] = true;
				break;
			case "btn2":
				if(state[0] == true) {
					System.out.println(rightMsg[1]);
					state[1] = true;
				}
				else if(state[0] == false) {
					System.out.println(wrongMsg[0]);
				}
				break;
			case "btn3":
				if (state[0] == true && state[1] == true) {
					System.out.println(rightMsg[2]);
					System.out.println(endMsg);
					end = false;
				}
				if (state[1] == false) {
					System.out.println(wrongMsg[1]);
				}
				break;
				
			}
		}
		
		
	}
}
