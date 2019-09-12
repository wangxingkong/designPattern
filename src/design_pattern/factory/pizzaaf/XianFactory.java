package design_pattern.factory.pizzaaf;

public class XianFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new XianDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new XianSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new XianCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		Veggies[] res={new XianVeggies(),new XianVeggies()};
		return res;
	}

	@Override
	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return new XianPepperoni();
	}

	@Override
	public Clams createClams() {
		// TODO Auto-generated method stub
		return new XianClams();
	}

}
