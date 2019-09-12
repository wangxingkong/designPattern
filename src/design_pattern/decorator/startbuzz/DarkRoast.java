package design_pattern.decorator.startbuzz;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description="dark roast coffee";
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}

}
