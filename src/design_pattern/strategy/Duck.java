package design_pattern.strategy;

public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		// TODO Auto-generated constructor stub
	}
	
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	abstract void  display();
	
	public  void  performFly() {
		flyBehavior.fly();
	}
	
	public  void  performQuack() {
		quackBehavior.quack();
	}
	
	public  void swim() {
		System.out.println("all duck  float,even decoys!");
	}
	
}
