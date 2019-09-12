package design_pattern.factory.pizzaaf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ChicagoDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new ChicagoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ChicagoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] veggies= {new ChicagoVeggies(),new ChicagoVeggies(),new ChicagoVeggies()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new ChicagoPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new ChicagoClam();
	}

}
