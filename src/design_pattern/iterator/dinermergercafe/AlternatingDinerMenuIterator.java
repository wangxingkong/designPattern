package design_pattern.iterator.dinermergercafe;

import java.util.Iterator;

import design_pattern.iterator.dinermerger.MenuItem;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem>{

	MenuItem[] items;
	int postion=0;
	
	public AlternatingDinerMenuIterator(MenuItem[] items) {
		// TODO Auto-generated constructor stub
		this.items=items;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(postion>=items.length||items[postion]==null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		return items[postion++];
	}

}
