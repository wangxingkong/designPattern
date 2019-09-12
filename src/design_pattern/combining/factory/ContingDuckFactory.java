package design_pattern.combining.factory;

import design_pattern.combining.decorator.DuckCall;
import design_pattern.combining.decorator.MallarDuck;
import design_pattern.combining.decorator.QuackCounter;
import design_pattern.combining.decorator.Quackable;
import design_pattern.combining.decorator.RedHeadDuck;
import design_pattern.combining.decorator.RubberDUck;

public class ContingDuckFactory extends AbstactDuckFactory{

	@Override
	public Quackable createMallarDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new MallarDuck());
	}

	@Override
	public Quackable createRedHeadDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RedHeadDuck());
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new QuackCounter(new DuckCall());
	}

	@Override
	public Quackable createRubberDuck() {
		// TODO Auto-generated method stub
		return new QuackCounter(new RubberDUck());
	}

}
