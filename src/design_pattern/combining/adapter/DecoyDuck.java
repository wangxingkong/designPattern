package design_pattern.combining.adapter;

public class DecoyDuck implements Quackable{

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("<< Slience >>");
	}

}
