package design_pattern.iterator.dinermergercafe;

import java.util.ArrayList;
import java.util.Iterator;

import design_pattern.iterator.dinermerger.MenuItem;

public class PancakeMenuIterator implements Iterator {

	ArrayList<MenuItem> menuItems;
	int currentPosition=0;
	public PancakeMenuIterator(ArrayList<MenuItem> menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems=menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return currentPosition<menuItems.size();
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		return menuItems.get(currentPosition++);
	}

}
