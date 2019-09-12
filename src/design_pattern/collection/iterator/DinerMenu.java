package design_pattern.collection.iterator;

public class DinerMenu implements Menu{

	static final int MAX_ITEMS=6;
	int numberOfItems=0;
	String[] menuItems;
	
	public DinerMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new String[MAX_ITEMS];
		addItem("vegetables BLT");
		addItem("BLT");
		addItem("soup of the day");
		addItem("hotdog");
		addItem("steamed veggies and brown rice");
		addItem("pasta");
	}
	
	public String[] getMenuItems() {
		return menuItems;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "diner menu";
	}
	
	public void addItem(String name) {
		if(numberOfItems>=MAX_ITEMS)
			System.out.println("sorry , you can not add");
		else {
			menuItems[numberOfItems]=name;
			numberOfItems++;
		}
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new DinerMenuIterator(menuItems);
	}

}
