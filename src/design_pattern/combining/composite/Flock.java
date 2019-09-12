package design_pattern.combining.composite;

import java.util.ArrayList;
import java.util.Iterator;

import design_pattern.combining.decorator.Quackable;

public class Flock implements Quackable{

	ArrayList<Quackable> quackers=new ArrayList<>();
	
	public void add(Quackable quackable) {
		quackers.add(quackable);
	}
	
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator<Quackable> iterator=quackers.iterator();
		while(iterator.hasNext()) {
			Quackable quackable=iterator.next();
			quackable.quack();
		}
	}

}
