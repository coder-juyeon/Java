package collectionTest;

public class User {
	private int number;
	private String name;
	private int age;
	
	public User () {;}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getname() {
		return name;
	}

	public void setname(String anme) {
		this.name = anme;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", age=" + age + "]";
	}

	public User(int number, String name, int age) {
		super();
		this.number = number;
		this.name = name;
		this.age = age;
	}
	
	
}
