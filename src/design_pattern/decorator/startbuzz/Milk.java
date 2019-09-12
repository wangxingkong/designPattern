package design_pattern.decorator.startbuzz;

public class Milk extends CondimentDecorator{

	public Milk(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" ,milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+.10;
	}

}
