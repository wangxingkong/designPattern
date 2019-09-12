package design_pattern.strategy;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		MallarDuck mallarDuck=new MallarDuck();
		FlyBehavior cantFly=()->System.out.println("i can not fly");
		QuackBehavior squeak=()->System.out.println("squeak");
		RubberDuck rubberDuck=new RubberDuck(cantFly,squeak);
		DecoyDuck decoyDuck=new DecoyDuck();
		Duck model=new ModelDuck();
		mallarDuck.performQuack();
		rubberDuck.performQuack();
		decoyDuck.performQuack();
		
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
	
}
