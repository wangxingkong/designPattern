package design_pattern.decorator.startbuzz;

public class Mocha  extends CondimentDecorator{

	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost()+.23;
	}

}
