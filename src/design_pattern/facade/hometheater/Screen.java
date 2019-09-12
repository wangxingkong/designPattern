package design_pattern.facade.hometheater;

public class Screen {

	String description;
	
	public Screen(String description) {
		// TODO Auto-generated constructor stub
		this.description=description;
	}
	
	public void up() {
		System.out.println(description+"  up");
	}
	
	public void down() {
		System.out.println(description+"  down");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
