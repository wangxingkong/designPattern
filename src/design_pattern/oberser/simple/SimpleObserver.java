package design_pattern.oberser.simple;

public class SimpleObserver implements Observer{

	private int value;
	private Subject simpleObserver;
	
	public SimpleObserver(Subject simpleObserver) {
		// TODO Auto-generated constructor stub
		this.simpleObserver=simpleObserver;
		simpleObserver.registerObserver(this);
	}
	
	@Override
	public void update(int value) {
		// TODO Auto-generated method stub
		this.value=value;
		display();
	}
	
	public void display() {
		System.out.println("value :"+value);
	}

}
