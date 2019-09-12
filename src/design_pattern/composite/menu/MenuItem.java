package design_pattern.composite.menu;

public class MenuItem extends MenuComponent{

	String name;
	String description;
	boolean vegetarian;
	double price;
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	@Override
	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "MenuItem [name=" + name + ", description=" + description + ", vegetarian=" + vegetarian + ", price="
				+ price + "]";
	}
	
}
