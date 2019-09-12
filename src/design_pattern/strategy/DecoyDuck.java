package design_pattern.strategy;

public class DecoyDuck extends Duck{

	public DecoyDuck() {
		// TODO Auto-generated constructor stub
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i am a duck decoy");
	}

}
