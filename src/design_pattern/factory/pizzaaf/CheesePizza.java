package design_pattern.factory.pizzaaf;

public class CheesePizza extends Pizza{

	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		// TODO Auto-generated constructor stub
		this.ingredientFactory=ingredientFactory;
	}
	
	void prepare() {
		System.out.println("׼��"+name);
		dough=ingredientFactory.createDough();
		sauce=ingredientFactory.createSauce();
		cheese=ingredientFactory.createCheese();
	}
	
}
