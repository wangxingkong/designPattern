package design_pattern.strategy;

public class RubberDuck extends Duck{

	public RubberDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior=new FlyNoWay();
		quackBehavior=new Squeak();
	}
	
	public RubberDuck(FlyBehavior cantFly, QuackBehavior squeak) {
		// TODO Auto-generated constructor stub
		flyBehavior=cantFly;
		quackBehavior=squeak;
	}

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a rubber duck");
	}

}
