package design_pattern.factory.pizzaaf;

public class XianStore {

	public Pizza creatPizza(String name) {
		PizzaIngredientFactory pizzaIngredientFactory=new XianFactory();
		Pizza pizza=null;
		if(name.equals("cheese")) {
		 pizza=new CheesePizza(pizzaIngredientFactory);
		}else {
			pizza=new VeggiePizza(pizzaIngredientFactory);
		}
		return pizza;
	}
	
}
