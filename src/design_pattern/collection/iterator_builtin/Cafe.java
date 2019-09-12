package design_pattern.collection.iterator_builtin;

import java.util.Iterator;

public class Cafe {

	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
		DinerMenu dinerMenu=new DinerMenu();
		
		Iterator<String> pancakeIterator=pancakeHouseMenu.createIterator();
		Iterator<String> dinnerIterator=dinerMenu.createIterator();
		System.out.println("menu (with iterators" +pancakeHouseMenu);
		printMenu(pancakeIterator);
		System.out.println("lunch");
		printMenu(dinnerIterator);
	}

	private static void printMenu(Iterator<String> dinerMenu) {
		// TODO Auto-generated method stub
		while(dinerMenu.hasNext()) {
			System.out.println(dinerMenu.next());
		}
	}
	
}
