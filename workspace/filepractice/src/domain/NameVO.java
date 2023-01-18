package domain;

public class NameVO {
	private String name; //이름
	private String ranking; //랭킹
	private String nameCount; //이름수
	private char gender;

	
	
	public NameVO(String name, String ranking, String nameCount, char gender) {
		super();
		this.name = name;
		this.ranking = ranking;
		this.nameCount = nameCount;
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "NameVO [name=" + name + ", ranking=" + ranking + ", nameCount=" + nameCount + ", gender=" + gender
				+ "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getRanking() {
		return ranking;
	}



	public void setRanking(String ranking) {
		this.ranking = ranking;
	}



	public String getNameCount() {
		return nameCount;
	}



	public void setNameCount(String nameCount) {
		this.nameCount = nameCount;
	}



	public char getGender() {
		return gender;
	}



	public void setGender(char gender) {
		this.gender = gender;
	}



	public NameVO() {;}
}
