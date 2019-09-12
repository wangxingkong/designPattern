package design_pattern.templatemethod.barista;

public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondinments();
	}
	
	abstract void brew();
	abstract void addCondinments();
	void boilWater() {
		System.out.println("正在加热水");
	}
	void pourInCup() {
		System.out.println("像茶壶里倒水");
	}
}
