package design_pattern.factory.pizzaaf;

public class VeggiePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;
	public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		// TODO Auto-generated constructor stub
		this.pizzaIngredientFactory=pizzaIngredientFactory;
	}
	
	@Override
	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("×¼±¸veggiÅûÈø");
		dough=pizzaIngredientFactory.createDough();
		sauce=pizzaIngredientFactory.createSauce();
		cheese=pizzaIngredientFactory.createCheese();
		veggies=pizzaIngredientFactory.createVeggies();
	}

}
