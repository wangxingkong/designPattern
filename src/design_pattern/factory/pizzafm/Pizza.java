package design_pattern.factory.pizzafm;

import java.util.ArrayList;

public class Pizza {

	protected String name;
	protected String dough;
	protected String sauce;
	protected ArrayList<String> toppings=new ArrayList<>();
	
	public void prepare() {
		System.out.println("prepare "+name);
		System.out.println("tossing dough...");
		System.out.println("adding sauce...");
		System.out.println("adding topping:");
		for(String top:toppings)
			System.out.println("    "+top);
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
 
	public void cut() {
		System.out.println("Cut the pizza into diagonal slices");
	}
  
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
 
	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(dough + "\n");
		display.append(sauce + "\n");
		for (String topping : toppings) {
			display.append(topping + "\n");
		}
		return display.toString();
	}
	
}
