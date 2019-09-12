package design_pattern.decorator.pizza;

public class Cheese extends ToppingDecorator{

	public Cheese(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+" cheese";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+.70;
	}

}
