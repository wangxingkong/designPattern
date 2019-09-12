package design_pattern.templatemethod.simplebarista;

public class TeaAndCoffeeTest {

	public static void main(String[] args) {
		Tea tea=new Tea();
		tea.prepareRecipe();
		Coffee coffee=new Coffee();
		coffee.prepareRecipe();
	}
	
}
