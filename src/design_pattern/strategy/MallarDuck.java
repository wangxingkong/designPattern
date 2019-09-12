package design_pattern.strategy;

public class MallarDuck extends Duck{

	public MallarDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior=new Quack();
		flyBehavior=new FlyWithWings();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i am  a real mallard duck");
	}

}
