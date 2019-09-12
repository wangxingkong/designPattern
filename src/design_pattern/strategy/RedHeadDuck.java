package design_pattern.strategy;

public class RedHeadDuck extends Duck{

	public RedHeadDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior=new FlyWithWings();
		quackBehavior=new Quack();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i am  real  red head duck");
	}

}
