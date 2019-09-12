package design_pattern.iterator.dinermergercafe;

import java.util.ArrayList;
import java.util.Iterator;

import design_pattern.iterator.dinermerger.MenuItem;

public class PancakeMenu implements Menu{

	ArrayList<MenuItem> menuItems;
	
	public PancakeMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new ArrayList<>();
		addItem("pancakeMenus 1","pancakesMenus 1",true,2.3);
		addItem("pancakeMenus 2","pancakesMenus 2",true,2.3);
		addItem("pancakeMenus 3","pancakesMenus 3",true,2.3);
		addItem("pancakeMenus 4","pancakesMenus 4",true,2.3);
	}
	
	private void addItem(String string, String string2, boolean b, double d) {
		// TODO Auto-generated method stub
		MenuItem menuItem=new MenuItem(string, string2, b, d);
		menuItems.add(menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PancakeMenuIterator(menuItems);
	}

}
