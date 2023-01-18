package job;
//수익창출
//확률
//메뉴 : 1.숫자맞추기 공연 2. 비둘기 공연 3. 은퇴하기
//상대방이 생각한 숫자 맞추기
//업다운
//맞추면 박수확률 증가
//박수 받으면 공연성공
//5번 못맞추면 공연 실패


//3개의 모자 중 비둘기 한마리가 어디있는지 찾기
//맞추면 박수확률 증가
//3번의 기회
//기회가 끝날 시 공연 실패

//공연 3회 실패시 마술사 퇴출로 게임종료 (bad ending)
//공연 성공시 수당 제공, 묻고 더블로갈지 이것만 받을지 결정
//돈으로 랭킹매기기

//항상 주석달기 
//화면에서 할 것과 메소드에서 할 것 구분하기
public class Magician {
	int chance;
	int percent;
	int money;
	int choice;
	int[] rating;
	
	
	public Magician() {}
		
//	수당받기
	int getMoney() {
		this.money += 100;
		return money;
	}
	
//	컴퓨터가 뽑은 랜덤 숫자 맞추기
	boolean playGuessInt(int data, int guess){
		boolean check = false;
		if (data > guess) {
			System.out.println("업");
		}
		else if (data < guess) {
			System.out.println("다운");
		}
		else {
			this.percent += 5;
			check = true;
		}
		return check;
	}
	
//	비둘기 맞추기
	boolean playGuessPigeon(int myChoice, int pigeonChoice){
		boolean check = false;
		if (myChoice == pigeonChoice) {
			check = true;
			this.percent += 5;
		}
		else {
			this.chance--;
			
		}
		return check;
	}
}