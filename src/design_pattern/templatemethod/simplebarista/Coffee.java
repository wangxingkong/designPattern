package design_pattern.templatemethod.simplebarista;

public class Coffee {

	void  prepareRecipe() {
		boilWater();
		brewCoffeeGrinds();
		pourInCup();
		addSugarAndMilk();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("给杯子里面增加水");
	}
	
	private void brewCoffeeGrinds() {
		System.out.println("给咖啡杯里加混合物");
	}
	private void pourInCup() {
		System.out.println("将煮好的东西倒进杯子里");
	}
	private void addSugarAndMilk() {
		System.out.println("给咖啡里面增加糖和牛奶");
	}
}
