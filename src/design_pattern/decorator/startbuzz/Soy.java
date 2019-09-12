package design_pattern.decorator.startbuzz;

public class Soy extends CondimentDecorator{

	public Soy(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage=beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+" ,soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .15+beverage.cost();
	}

}
