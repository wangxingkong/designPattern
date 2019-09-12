package design_pattern.facade.hometheater;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		// TODO Auto-generated constructor stub
		this.description=description;
	}
	
	public void on() {
		System.out.println(description+"  on");
	}
	
	public void off() {
		System.out.println(description+"  off");
	}
	
	public void pop() {
		System.out.println(description+"   pop");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return description;
	}
}
