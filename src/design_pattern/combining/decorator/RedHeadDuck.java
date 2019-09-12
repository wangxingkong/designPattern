package design_pattern.combining.decorator;

public class RedHeadDuck implements Quackable{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("redheadduck quark quark");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "redheadquark";
	}

}
