package design_pattern.collection.iterator_builtin;

import java.util.Iterator;

public class DinerMenu implements Menu{

	static final  int MAX_LENGTH=6;
	int indexOfArray=0;
	String[] menuItems;
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new String[MAX_LENGTH];
		addItem("gedatang");
		addItem("soup");
	}
	
	private void  addItem(String name) {
		if(indexOfArray>=MAX_LENGTH)
			System.out.println("sorry, you  have over the max length");
		else {
			menuItems[indexOfArray]=name;
			indexOfArray++;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Diner Menu";
	}
	
	public String[] getMenuItems() {
		return menuItems;
	}
	
	@Override
	public Iterator<String> createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIteratorBuiltin(menuItems);
	}

}
