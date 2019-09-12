package design_pattern.combining.factory;

import design_pattern.combining.decorator.Quackable;

public abstract class AbstactDuckFactory {

	public abstract Quackable createMallarDuck();
	public abstract Quackable createRedHeadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
