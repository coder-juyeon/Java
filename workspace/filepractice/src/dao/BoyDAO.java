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
//		�޸����� �����͸� VO��ü�� ����
//		�޸����� ������ �о
//		������ �и��Ѵ���
//		�и��� ���ڵ��� ���� null�� ���������� 3���� �ݺ��ؼ� �̸�, ��ŷ, �̸��� �� �־��ش�.

	}
}
