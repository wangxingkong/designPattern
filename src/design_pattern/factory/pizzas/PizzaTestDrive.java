package design_pattern.factory.pizzas;

import design_pattern.factory.pizzafm.Pizza;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore store=new PizzaStore(new SimplePizzaFactory());
		Pizza pizza=store.orderPizza("cheese");
		System.out.println(pizza);
		pizza=store.orderPizza("clam");
		System.out.println(pizza);
	}
	
}
