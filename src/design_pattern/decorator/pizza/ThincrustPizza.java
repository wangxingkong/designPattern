package design_pattern.decorator.pizza;

public class ThincrustPizza extends Pizza{

	public ThincrustPizza() {
		// TODO Auto-generated constructor stub
		description="thin crust pizza";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.99;
	}

}
