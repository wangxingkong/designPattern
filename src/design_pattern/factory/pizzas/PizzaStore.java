package design_pattern.factory.pizzas;

import design_pattern.factory.pizzafm.Pizza;

public class PizzaStore {

	SimplePizzaFactory factory;
	public PizzaStore(SimplePizzaFactory factory) {
		// TODO Auto-generated constructor stub
		this.factory=factory;
	}
	
	 
		public Pizza orderPizza(String type) {
			Pizza pizza;
	 
			pizza = factory.createPizza(type);
	 
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();

			return pizza;
		}

}
