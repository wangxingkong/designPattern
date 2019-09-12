package design_pattern.factory.pizzaaf;

public class PizzaTestDrive {

	public static void main(String[] args) {
		ChicagoPizzaStore store=new ChicagoPizzaStore();
		Pizza pizza=store.createPizza("cheese");
		 pizza=store.createPizza("veggie");
		System.out.println(pizza);
		XianStore xianStore=new XianStore();
		 pizza = xianStore.creatPizza("cheese");
		System.out.println(pizza);
	}
	
}
