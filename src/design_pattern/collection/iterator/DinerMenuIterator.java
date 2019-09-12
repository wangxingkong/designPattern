package design_pattern.collection.iterator;

public class DinerMenuIterator implements Iterator {

	String[] items;
	int positon;
	
	public DinerMenuIterator(String[] items) {
		// TODO Auto-generated constructor stub
		this.items=items;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(positon>=items.length||items[positon]==null)
			return false;
		else return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		String menuItem=items[positon];
		positon++;
		return menuItem;
	}

}
