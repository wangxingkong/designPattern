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
		System.out.println("������ˮ");
	}
	public void pourInCup() {
		System.out.println("��ˮ���ﵹˮ");
	}
	public boolean customerWantsCondiments(){
		return true;
	}
}
