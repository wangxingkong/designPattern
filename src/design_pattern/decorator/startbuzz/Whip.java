package design_pattern.decorator.startbuzz;

public class Whip extends CondimentDecorator{

	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"  ,whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+beverage.cost();
	}

}
