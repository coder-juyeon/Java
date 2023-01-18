package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import domain.BoyVO;

public class BoyDAO {
	DBConnecter dbConnecter = new DBConnecter();
	
	public BoyVO setObject(String file) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(DBConnecter.BOYPATH));
		BoyVO boyVO = new BoyVO();
		String data = bufferedReader.readLine();	
//		ArrayList<String> arData = new ArrayList<String>();
		String arData = null;
		arData += data.split("\t");
		
		return boyVO;
	}
	public static void main(String[] args) throws IOException {
//		메모장의 데이터를 VO객체로 리턴
//		메모장의 파일을 읽어서
//		탭으로 분리한다음
//		분리한 글자들을 끝에 null이 없을때까지 3번씩 반복해서 이름, 랭킹, 이름수 에 넣어준다.

	}
}
