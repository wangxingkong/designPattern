package design_pattern.factory.pizzas;

import design_pattern.factory.pizzafm.Pizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if(type.equals("cheese")) {
			pizza= new CheesePizza();
		}else if(type.equals("clam"))
			pizza=new  ClamPizza();
		return pizza;
	}
	
}
