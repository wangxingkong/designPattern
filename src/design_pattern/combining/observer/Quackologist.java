package design_pattern.combining.observer;

public class Quackologist implements Observer{

	@Override
	public void update(QuackObservable duck) {
		// TODO Auto-generated method stub
		System.out.println("quackologist:"+duck);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Quackologist";
	}
}
