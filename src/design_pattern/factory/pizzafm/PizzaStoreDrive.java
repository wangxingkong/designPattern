package design_pattern.factory.pizzafm;

public class PizzaStoreDrive {

	public static void main(String[] args) {
		PizzaStore chicago=new ChicagoPizzaStore();
		Pizza pizza=chicago.orderPizza("cheese");
		System.out.println(pizza);
		pizza=chicago.orderPizza("clam");
		System.out.println(pizza);
		
		PizzaStore bjPizzaStore=new BJPizzaStore();
		pizza=bjPizzaStore.orderPizza("cheese");
		System.out.println(pizza);
		pizza=bjPizzaStore.orderPizza("clam");
		System.out.println(pizza);
	}
	
}
