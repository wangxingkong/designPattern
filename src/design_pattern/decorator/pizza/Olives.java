package design_pattern.decorator.pizza;

public class Olives extends ToppingDecorator{

	public Olives(Pizza pizza) {
		// TODO Auto-generated constructor stub
		this.pizza=pizza;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return pizza.getDescription()+"  olvies";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return pizza.cost()+.30;
	}

}
