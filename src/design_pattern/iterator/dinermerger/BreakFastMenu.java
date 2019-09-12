package design_pattern.iterator.dinermerger;

import java.util.ArrayList;

public class BreakFastMenu implements Menu{

	ArrayList<MenuItem> menuItems=new ArrayList<>();
	int currentPosition=0;
	
	public BreakFastMenu() {
		// TODO Auto-generated constructor stub
		addItems("breakfast food1","breakfast food1  desc",true,20.0);
		addItems("breakfast food2","breakfast food2  desc",true,20.0);
		addItems("breakfast food3","breakfast food3  desc",true,20.0);
		addItems("breakfast food4","breakfast food4  desc",true,20.0);
	}
	
	private void addItems(String string, String string2, boolean b, double d) {
		// TODO Auto-generated method stub
		menuItems.add(new MenuItem(string, string2, b, d));
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ArraylistIterator(menuItems);
	}

	
}
