package design_pattern.collection.iterator_builtin;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

	private ArrayList<String> menuItems;
	private int currentPostion;
	
	public PancakeHouseMenu() {
		// TODO Auto-generated constructor stub
		menuItems=new ArrayList<>();
		addItem("øæ¿‰√Ê");
		addItem("π¨±£º¶∂°");
	}
	
	private void addItem(String name) {
		menuItems.add(name);
	}
	
	public ArrayList<String> getMenuItems() {
		return menuItems;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "pancake house menu";
	}
	
	@Override
	public Iterator<String> createIterator() {
		// TODO Auto-generated method stub
		return new pancakeHouseMenuIteratorBuiltin(menuItems);
	}

}
