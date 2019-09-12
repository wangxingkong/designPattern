package design_pattern.combining.composite;

import design_pattern.combining.decorator.Goose;
import design_pattern.combining.decorator.GooseAdapter;
import design_pattern.combining.decorator.MallarDuck;
import design_pattern.combining.decorator.Quackable;
import design_pattern.combining.factory.AbstactDuckFactory;
import design_pattern.combining.factory.ContingDuckFactory;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator duckSimulator=new DuckSimulator();
		AbstactDuckFactory factory=new ContingDuckFactory();
		duckSimulator.simulate(factory);
	}

	private void simulate(AbstactDuckFactory factory) {
		// TODO Auto-generated method stub
		Quackable redheadDuck=factory.createRedHeadDuck();
		Quackable duckcall=factory.createDuckCall();
		Quackable rubberDuck=factory.createRubberDuck();
		Quackable gooseDuck=new GooseAdapter(new Goose());
		System.out.println("------------");
		Flock flock=new Flock();
		flock.add(redheadDuck);
		flock.add(duckcall);
		flock.add(rubberDuck);
		flock.add(gooseDuck);
		flock.quack();
		Flock marllardDuck=new Flock();
		marllardDuck.add(factory.createMallarDuck());
		marllardDuck.add(factory.createMallarDuck());
		marllardDuck.add(factory.createMallarDuck());
		marllardDuck.add(factory.createMallarDuck());
		marllardDuck.quack();
	}
	
}
