package design_pattern.combining.decorator;

public class QuackCounter implements Quackable {

	Quackable duck;
	static int numberOfQuacks;
	
	public QuackCounter(Quackable duck) {
		// TODO Auto-generated constructor stub
		this.duck=duck;
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		duck.quack();
		numberOfQuacks++;
	}
	
	public static int  getQuacks() {
		return numberOfQuacks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return duck.toString();
	}

}
