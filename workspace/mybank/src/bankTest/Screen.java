package bankTest;

import java.util.Scanner;

//"계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급 ->
//계좌 발급하면 계좌번호 모르니까 핸드폰 번호와 비밀번호로 서비스 이용가능하게), 나가기"로 구성되어 있다.

public class Screen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank[][] arrBank = new Bank[3][100];
		int[] arCount = new int[3];
		Bank[] arBank = null;
		Bank user = new Bank();
		
		int index = 0;
		int serviceChoice = 0;
		
		
		while(true) {
			System.out.println("은행선택: 1. 신한 2. 국민. 3. 카카오 4. 나가기");
			index = sc.nextInt();
			
			if(index == 4) {break;}
//			인덱스로 쓸 거라서 1을 빼준다.
			index--;
			
			System.out.println("서비스 선택: 1. 계좌개설\n 2. 입금하기\n 3. 출금하기\n 4. 잔핵조회\n 5. 계좌번호 찾기\n 6. 은행다시선택");
			serviceChoice = sc.nextInt();
			
			switch(serviceChoice) {
//			계좌개설
			case 1:
				arBank = new Bank[] {new ShinHan(), new KB(), new Kakao()};
				
				while(true) {
//					계좌번호 생성
					System.out.println("예금주 입력: ");
					String name = sc.next();
					System.out.println("핸드폰 번호 입력");
					String phoneNumber = sc.next();
					System.out.println("비밀번호 입력: ");
					String password = sc.next();
					
//					계좌생성메소드
					user.accountCreate(name, phoneNumber, password);
//					생성한거 arrBank에 넣기
					arrBank[index][arCount[index]] = user;
					
//					중복체크
					
					
				}
			}
			
		}
		
		
	}
}
