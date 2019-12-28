package designpattern.ch09Composite;

public class MenuItem extends MenuComponent {
	String name;
	String description;
	boolean vegatarian;
	double price;
	public MenuItem(String name, String description, boolean vegatarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegatarian = vegatarian;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public boolean isVegatarian() {
		return vegatarian;
	}
	public double getPrice() {
		return price;
	}
	
	public void print() {
		System.out.println(" " + getName());
		if(isVegatarian()) {
			System.out.println("(v)");
		} 
		System.out.println(", " + getPrice());
		System.out.println("  -- " + getDescription());
	}
}
