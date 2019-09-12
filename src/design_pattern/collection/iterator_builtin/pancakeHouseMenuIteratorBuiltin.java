package design_pattern.collection.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class pancakeHouseMenuIteratorBuiltin implements Iterator<String> {

	private ArrayList<String> menuItems;
	private int currentPostion=0;
	
	public pancakeHouseMenuIteratorBuiltin(ArrayList<String> menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems=menuItems;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(currentPostion>=menuItems.size())
			return false;
		else
			return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return menuItems.get(currentPostion++);
	}

}
