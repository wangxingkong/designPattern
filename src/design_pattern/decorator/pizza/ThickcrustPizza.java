package design_pattern.decorator.pizza;

public class ThickcrustPizza extends Pizza {

	public ThickcrustPizza() {
		// TODO Auto-generated constructor stub
		description="thick crust pizza";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 9.99;
	}
}
