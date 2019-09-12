package design_pattern.iterator.dinermerger;

public class DinerMenu implements Menu{

	static final int MAX_ITEMS=7;
	int numberOfItems=0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new MenuItem[MAX_ITEMS];
		addItem("dinner food1","i am dinner food1",true,2.99);
		addItem("dinner food2","i am dinner food2",true,2.99);
		addItem("dinner food3","i am dinner food3",true,2.99);
		addItem("dinner food4","i am dinner food4",true,2.99);
		
	}
	
	
	private void addItem(String string, String string2, boolean b, double d) {
		// TODO Auto-generated method stub
		menuItems[numberOfItems++]=new MenuItem(string, string2, b, d);
	}


	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ArrayIterator(menuItems);
	}

}
