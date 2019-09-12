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
		System.out.println("���ڼ���ˮ");
	}
	void pourInCup() {
		System.out.println("�����ﵹˮ");
	}
}
