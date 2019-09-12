package design_pattern.composite.menuIterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	Stack<Iterator<MenuComponent>> stack=new Stack<>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		// TODO Auto-generated constructor stub
		stack.push(iterator);
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(stack.isEmpty())
			return false;
		else {
			Iterator<MenuComponent> tops=stack.peek();
			if(tops.hasNext())
				return true;
			else {
				stack.pop();
				return hasNext();
			}
		}
	}

	@Override
	public MenuComponent next() {
		// TODO Auto-generated method stub
		if(hasNext()) {
			Iterator<MenuComponent> iterator=stack.peek();
			MenuComponent component=iterator.next();
			stack.push(component.createIterator());
			return component;
		}
		return null;
	}

}
