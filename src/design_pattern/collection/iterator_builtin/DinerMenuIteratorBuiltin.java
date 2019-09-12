package design_pattern.collection.iterator_builtin;

import java.util.Iterator;

public class DinerMenuIteratorBuiltin implements Iterator<String> {

	String[] menuItems;
	private int currentPostion;
	public DinerMenuIteratorBuiltin(String[] menuItems) {
		// TODO Auto-generated constructor stub
		this.menuItems=menuItems;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(currentPostion>=menuItems.length||menuItems[currentPostion]==null)
			return false;
		return true;
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		String item=menuItems[currentPostion];
		currentPostion++;
		return item;
	}

}
