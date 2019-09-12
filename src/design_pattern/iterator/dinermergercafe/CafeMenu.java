package design_pattern.iterator.dinermergercafe;

import java.util.HashMap;

import design_pattern.iterator.dinermerger.Iterator;
import design_pattern.iterator.dinermerger.Menu;
import design_pattern.iterator.dinermerger.MenuItem;

public class CafeMenu implements Menu{

	HashMap<String, MenuItem> menuitems=new HashMap<>();
	
	public CafeMenu() {
		// TODO Auto-generated constructor stub
		addItems("cafe food1","cafe food1",true,2.22);
		addItems("cafe food2","cafe food2",true,2.22);
		addItems("cafe food3","cafe food3",true,2.22);
		addItems("cafe food4","cafe food4",true,2.22);
	}
	
	private void addItems(String string, String string2, boolean b, double d) {
		// TODO Auto-generated method stub
		MenuItem menuItem=new MenuItem(string, string2, b, d);
		menuitems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
