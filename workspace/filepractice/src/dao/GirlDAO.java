package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GirlDAO {
	public String setObject() throws IOException {
		 String content = new String(Files.readAllBytes(Paths.get(DBConnecter.GIRLPATH)));
		 return content;
	}
}
