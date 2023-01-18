package arrayListTask3;

public class Love {
	private int index;
	private String name;
	private int age;
	
	public Love() {;}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Love [index=" + index + ", name=" + name + ", age=" + age;
	}
}
