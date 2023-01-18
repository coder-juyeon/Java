package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ChildDAO {
	public void setObject() throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.BOYPATH)));
		System.out.println(content);
	}
	public static void main(String[] args) throws IOException {
		ChildDAO childDAO = new ChildDAO();
	}
}
