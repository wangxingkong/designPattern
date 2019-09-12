package design_pattern.collection.iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

	ArrayList<String> items;
	int positon=0;
	
	public PancakeHouseMenuIterator(ArrayList<String> items) {
		// TODO Auto-generated constructor stub
		this.items=items;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(positon>=items.size())
			return false;
		else 
		return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String menuItems=(String)items.get(positon);
		positon++;
		return menuItems;
	}

}
