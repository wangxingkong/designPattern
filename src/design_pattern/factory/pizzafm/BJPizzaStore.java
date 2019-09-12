package design_pattern.factory.pizzafm;

public class BJPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese"))
			return new BJCheesePizza();
		else if(item.equals("clam"))
			return new BJClamPizza();
		return null;
	}

}
