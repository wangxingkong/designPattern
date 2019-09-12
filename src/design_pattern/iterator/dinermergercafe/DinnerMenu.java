package design_pattern.iterator.dinermergercafe;

import java.util.Iterator;

import design_pattern.iterator.dinermerger.MenuItem;


public class DinnerMenu implements  Menu {

	static final int MAX_ITEMS=6;
	int currentPosition=0;
	MenuItem[] menuItems;
	
	public DinnerMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new MenuItem[MAX_ITEMS];
		addItems("DinnerMenu 1","wo shi  dinnermenu 1",true,2.1);
		addItems("DinnerMenu 2","wo shi  dinnermenu 2",true,2.1);
		addItems("DinnerMenu 3","wo shi  dinnermenu3",true,2.1);
		addItems("DinnerMenu 4","wo shi  dinnermen4u4",true,2.1);
	}
	
	private void addItems(String string, String string2, boolean b, double d) {
		// TODO Auto-generated method stub
		MenuItem menuItem=new MenuItem(string, string2, b, d);
		if(currentPosition<MAX_ITEMS)
			menuItems[currentPosition++]=menuItem;
		else 
			System.out.println("不能再添加");
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(menuItems);
	}
}
