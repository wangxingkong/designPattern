package design_pattern.combining.factory;

import design_pattern.combining.adapter.Goose;
import design_pattern.combining.adapter.GooseAdapter;
import design_pattern.combining.decorator.*;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator=new DuckSimulator();
		AbstactDuckFactory duckFactory=new ContingDuckFactory();
		simulator.simulate(duckFactory);
	}
	
	void simulate(AbstactDuckFactory duckFactory) {
		Quackable mallarDuck=duckFactory.createMallarDuck();
		Quackable redheadDuck=duckFactory.createRedHeadDuck();
		Quackable duckCall=duckFactory.createDuckCall();
		Quackable rubberDuck=duckFactory.createRubberDuck();
		simulate(mallarDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
	}
	
	void simulate(Quackable quackable) {
		quackable.quack();
	}
	
}
