package test1;

import java.util.Scanner;

public class array {
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
		
//		temp 변수 사용해서 전의 입력을 저장받기
//		다 배열로 저장하기
		
//		1 -> 2-> 3
//		2 -> 1
//		3 -> 2 -> 1
//		1 -> 3-> 2
		Scanner sc = new Scanner(System.in);
		String msg = "버튼을 선택하세요: ";
		String errorMsg = "잘못 입력하셨습니다.";
		String endMsg = "종료합니다.";
		String result = null;
		String[] arData = {"1. btn1", "2. btn2", "3. btn3", "4. btn4"};
		String[] wrongMsg = {"회원가입을 먼저 진행해주세요.", "로그인을 먼저 진행해주세요."};
		String[] rightMsg = {"회원가입 성공", "로그인 성공", "김주연(23)"};
		boolean end = true;
		int choice = 0;
		int temp = 0;
		boolean condition = false;
		
		
		while(end) {
			for (int i = 0; i < arData.length; i++) {
				System.out.print(arData[i] + "\t");
			}
			System.out.print(msg);
			
			temp = choice;          //이 둘의 순서가 중요!!
			choice = sc.nextInt(); //이 둘의 순서가 중요!!
			condition = choice - 1 == temp;
			
			switch(choice) {
			case 1:
				result = rightMsg[choice -1];
				break;
			case 2:
				result = condition ? rightMsg[choice -1] : wrongMsg[choice -2];
				if(!condition) {
					choice = 0;
				}
				break;
			case 3:
				result = condition ? rightMsg[choice -1] : wrongMsg[choice -2];
				if(!condition) {
					choice = 0;
				}
				break;
			case 4:
				end = false;
				result = endMsg;
				break;
			default:
				break;
			}
			System.out.println(result);
			
		}

	}
}
