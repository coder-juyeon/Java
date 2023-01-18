package hashMapTest;

public class Product {
	private int number;
	private int cost;
	private int stock;
	private String name;
	
	public Product(int number, int cost, int stock, String name) {
		super();
		this.number = number;
		this.cost = cost;
		this.stock = stock;
		this.name = name;
	}
	
	public Product() {;}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Goods [number=" + number + ", cost=" + cost + ", stock=" + stock + ", name=" + name + "]";
	}
	
	
}
