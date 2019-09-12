package design_pattern.combining.decorator;

public class DuckCall implements Quackable{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("gua gua gua ");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "duckcall";
	}
	
}
