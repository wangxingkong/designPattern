package design_pattern.factory.pizzafm;


public class ChicagoPizzaStore extends PizzaStore{

	@Override
	Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if(item.equals("cheese")) {
			return  new ChicagoCheese();
		}else if(item.equals("clam"))
		return new  ChicagoClam();
		return null;
	}

}
