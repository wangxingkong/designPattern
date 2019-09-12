package design_pattern.combining.decorator;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator=new DuckSimulator();
		simulator.simulate();
	}

	private void simulate() {
		// TODO Auto-generated method stub
		Quackable mallardDuck=new QuackCounter(new MallarDuck());
		Quackable redHeadDuck=new QuackCounter(new RedHeadDuck());
		Quackable duckCall=new QuackCounter(new DuckCall());
		Quackable rubberDuck=new QuackCounter(new RubberDUck());
		Quackable gooseDuck=new QuackCounter(new GooseAdapter(new Goose()));
		System.out.println(" duck simulator:with decorator");
		simulate(mallardDuck);
		simulate(redHeadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);
		System.out.println("the duck times is:"+QuackCounter.getQuacks());
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
