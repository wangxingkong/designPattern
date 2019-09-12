package design_pattern.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	abstract void brew();
	abstract void addCondiments();
	public void boilWater() {
		System.out.println("正在烧水");
	}
	public void pourInCup() {
		System.out.println("让水壶里倒水");
	}
	public boolean customerWantsCondiments(){
		return true;
	}
}
