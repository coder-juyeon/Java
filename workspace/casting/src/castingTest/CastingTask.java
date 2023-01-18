package castingTest;

import java.util.Scanner;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� �ڸ����� ��� ���
//��ȭ��� 4D ��� ���
//��󸶶�� ���� ��� ���

public class CastingTask {
	
//	����ڰ� ������ ������ � �帣���� �˻�
//	�ڽ��� ��� ������ �𸣴ϱ� ���� Ÿ������ �Ű����� �ޱ�
	public void checkVideo(Video video) {
//		���� �� Ÿ���� �ִϸ��̼� �帣��� 
//		���� �ڽ��� ��� ������ ���� �θ� Ÿ���� ������ �޾Ҵµ�
//		�ڽ��� �ִϸ��̼� ����� ����ϱ� ���� �ٿ�ĳ���� ����
//		�ڽ� �޼ҵ� ���
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
		
//		checkVideo�� �Ű����� ����
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
