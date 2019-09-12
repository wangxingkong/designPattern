package design_pattern.adapter.ducks;

public class MallardDuck implements Duck{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("quack");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("i am flying");
	}

}
