package design_pattern.factory.pizzaaf;

import design_pattern.decorator.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

	protected Pizza createPizza(String item) {
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
		if(item.equals("cheese")) {
			pizza=new CheesePizza(ingredientFactory);
			pizza.setName("÷•º”∏Áª∆”Õ≈˚»¯");
		}else if(item.equals("veggie")) {
			pizza=new VeggiePizza(ingredientFactory);
			pizza.setName("÷•º”∏Áveggie≈˚»¯");
		}
		
		return pizza;
	}
	
}
