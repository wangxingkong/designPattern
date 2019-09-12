package design_pattern.combining.decorator;

public class DecoyDuck implements Quackable {

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("wo shi decoy duck");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "decoy duck";
	}

}
