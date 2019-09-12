package design_pattern.decorator.pizza;

public abstract class Pizza {

	String  description="basic pizza";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	
}
