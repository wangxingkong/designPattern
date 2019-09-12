package design_pattern.decorator.pizza;

public class PizzaStore {

	public static void main(String[] args) {
		Pizza pizza=new ThickcrustPizza();
		Pizza cheesePizza=new Cheese(pizza);
		Pizza greekPizza=new Olives(pizza);
		System.out.println(greekPizza.getDescription());
		System.out.println(cheesePizza.getDescription());
	}
	
}
