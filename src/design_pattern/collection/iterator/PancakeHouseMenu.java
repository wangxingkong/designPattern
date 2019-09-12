package design_pattern.collection.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu implements Menu{

	ArrayList<String> menuItems;
	
	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new ArrayList<>();
		addItems("K&B's Pancake Breakfast");
		addItems("Regular Pancake Breakfast");
		addItems("BlueBerry Pancakes");
		addItems("Waffles");
	}
	
	public void addItems(String items) {
		menuItems.add(items);
	}
	
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pancake House Menu";
	}
	
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new PancakeHouseMenuIterator(menuItems);
	}

}
