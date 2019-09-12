package design_pattern.iterator.dinermerger;

public class MenuItem {

	String name;
	String description;
	boolean isVegetarian;
	double price;
	public MenuItem(String name, String description, boolean isVegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.isVegetarian = isVegetarian;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public boolean isVegetarian() {
		return isVegetarian;
	}
	
	public String toString() {
		return (name + ", $" + price + "\n   " + description);
	}
	
}
