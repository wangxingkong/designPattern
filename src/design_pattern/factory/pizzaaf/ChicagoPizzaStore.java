package design_pattern.factory.pizzaaf;

import design_pattern.decorator.pizza.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore{

	protected Pizza createPizza(String item) {
		Pizza pizza=null;
		PizzaIngredientFactory ingredientFactory=new ChicagoPizzaIngredientFactory();
		if(item.equals("cheese")) {
			pizza=new CheesePizza(ingredientFactory);
			pizza.setName("֥�Ӹ��������");
		}else if(item.equals("veggie")) {
			pizza=new VeggiePizza(ingredientFactory);
			pizza.setName("֥�Ӹ�veggie����");
		}
		
		return pizza;
	}
	
}
