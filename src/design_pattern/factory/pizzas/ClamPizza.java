package design_pattern.factory.pizzas;

import design_pattern.factory.pizzafm.Pizza;

public class ClamPizza extends Pizza{

	public ClamPizza() {
		// TODO Auto-generated constructor stub
		name="Clam pizza";
		dough="Clam pizza";
		sauce="Clam pizza";
		toppings.add("Clam mozzarella");
		toppings.add("Clam parmesan");
	}
	
}
