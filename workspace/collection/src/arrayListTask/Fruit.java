package arrayListTask;

public class Fruit {
	private String Name;
	private int cost;
	
	public Fruit() {;}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Fruit [Name=" + Name + ", cost=" + cost + "]";
	}

}
