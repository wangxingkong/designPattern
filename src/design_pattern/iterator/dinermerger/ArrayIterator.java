package design_pattern.iterator.dinermerger;

public class ArrayIterator implements Iterator {

	MenuItem[] menuItem;
	int position=0;
	public ArrayIterator(MenuItem[] menuItem) {
		// TODO Auto-generated constructor stub
		this.menuItem=menuItem;
	}
	
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(position>=menuItem.length||menuItem[position]==null)
			return false;
		return true;
	}

	public MenuItem next() {
		// TODO Auto-generated method stub
		MenuItem menuItems=menuItem[position];
		position++;
		return  menuItems;
	}

}
