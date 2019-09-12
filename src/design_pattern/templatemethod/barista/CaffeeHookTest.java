package design_pattern.templatemethod.barista;

public class CaffeeHookTest {

	public static void main(String[] args) {
		Coffee coffee=new Coffee();
//		coffee.prepareRecipe();
		CoffeeWithHook coffeeWithHook=new CoffeeWithHook();
		coffeeWithHook.prepareRecipe();
	}
	
}
