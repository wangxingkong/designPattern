package design_pattern.strategy;

public class MiniDuckSImulator2 {
	
	public static void main(String[] args) {
		Duck mallor=new MallarDuck();
		mallor.performFly();
		mallor.performQuack();
		Duck  model=new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}