package design_pattern.factory.pizzas;

import design_pattern.factory.pizzafm.Pizza;

public class CheesePizza extends Pizza{

	public CheesePizza() {
		// TODO Auto-generated constructor stub
		name="cheese pizza";
		dough="cheese pizza";
		sauce="cheese sauce pizza";
		toppings.add("cheese fresh mozzarella");
		toppings.add("cheese parmesan");
	}
	
}
