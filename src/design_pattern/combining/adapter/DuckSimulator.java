package design_pattern.combining.adapter;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator=new DuckSimulator();
		simulator.simulator();
	}

	private void simulator() {
		// TODO Auto-generated method stub
		Quackable mallarDuck=new MallarDuck();
		Quackable redheadDuck=new RedHeadDuck();
		Quackable duckCall=new DuckCall();
		Quackable rubberDuck=new RubberDuck();
		Quackable gooseDuck=new GooseAdapter(new Goose());
		System.out.println("duck simulator:with goose adaptor");
		simulator(mallarDuck);
		simulator(redheadDuck);
		simulator(duckCall);
		simulator(rubberDuck);
		simulator(gooseDuck);
	}
	
	void simulator(Quackable duck) {
		duck.quack();
	}
}
