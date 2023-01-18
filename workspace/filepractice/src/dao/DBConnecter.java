package dao;

import java.util.ArrayList;

import domain.BoyVO;

public class DBConnecter {
	public static ArrayList<BoyVO> boys = new ArrayList<BoyVO>();
	
	public static final String BOYPATH = "boyName.txt";
	public static final String GIRLPATH = "girlName.txt";
}
