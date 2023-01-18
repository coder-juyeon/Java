package arrayListTask2;

public class Food {
	private String name;
	private int cost;
	private String kind;
	
	public Food() {;}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", cost=" + cost + ", kind=" + kind + "]";
	}
	
	
}
