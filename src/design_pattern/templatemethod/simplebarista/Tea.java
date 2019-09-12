package design_pattern.templatemethod.simplebarista;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		putTea();
		pourInCup();
		addEmotion();
	}
	
	private void pourInCup() {
		System.out.println("放入杯子");
	}
	
	private void addEmotion() {
		System.out.println("茶里面加入感情最好喝");
	}
	private void boilWater() {
		System.out.println("将水煮开");
	}
	
	private void putTea() {
		System.out.println("放入茶叶");
	}
	
}
