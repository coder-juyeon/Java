package castingTest;

import java.util.Scanner;

//넷플릭스
//애니메이션, 영화, 드라마 클래스 선언
//사용자가 선택한 영상이
//애니메이션이라면 자막지원 기능 사용
//영화라면 4D 기능 사용
//드라마라면 굿즈 기능 사용

public class CastingTask {
	
//	사용자가 선택한 영상이 어떤 장르인지 검사
//	자식이 몇개가 있을지 모르니까 비디오 타입으로 매개변수 받기
	public void checkVideo(Video video) {
//		만약 이 타입이 애니메이션 장르라면 
//		지금 자식이 몇개가 있을지 몰라서 부모 타입인 비디오로 받았는데
//		자식의 애니메이션 기능을 사용하기 위해 다운캐스팅 한후
//		자식 메소드 사용
		if(video instanceof Animation) {
			Animation animation = (Animation) video;
			animation.getSubTitle();
		}
		else if(video instanceof Film) {
			Film film = (Film) video;
			film.moveChair();
		}
		else if(video instanceof Drama){
			Drama drama = (Drama) video;
			drama.sellGoods();
		}
	}
	
	public static void main(String[] args) {
		
//		checkVideo의 매개변수 선언
		Video[] videos = {
				new Animation(),
				new Film(),
				new Drama()
		};
		
		CastingTask castingTask = new CastingTask();
		
		for (int i = 0; i < videos.length; i++) {
			castingTask.checkVideo(videos[i]);
		}
		
	}
	
}
