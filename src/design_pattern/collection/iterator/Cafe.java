package design_pattern.collection.iterator;

import java.util.ArrayList;

public class Cafe {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
		DinerMenu dinerMenu=new DinerMenu();
		
		System.out.println("menu ---- breakfast");
		ArrayList<String> breakfasts=pancakeHouseMenu.getMenuItems();
		for(int i=0;i<breakfasts.size();i++) {
			String menuItem=(String)breakfasts.get(i);
			System.out.println(menuItem);
		}
		System.out.println("lunch");
		String[] lunchItems=dinerMenu.getMenuItems();
		for(int i=0;i<lunchItems.length;i++) {
			String menuItem=lunchItems[i];
			System.out.println(menuItem);
		}
		
		Iterator pancakeIterator=pancakeHouseMenu.createIterator();
		Iterator dinerIterator=dinerMenu.createIterator();
		System.out.println("menu (with iterators) breakfast");
		printMenu(pancakeIterator);
		printMenu(dinerIterator);
	}
	
	private static void  printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			String menuItem=(String)iterator.next();
			System.out.println(menuItem);
		}
	}
	
}
