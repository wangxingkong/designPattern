package design_pattern.strategy;

public class ModelDuck extends Duck{

	public ModelDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior=new  FlyNoWay();
		quackBehavior=new Quack();
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("i am  a  model duck");
	}

}
