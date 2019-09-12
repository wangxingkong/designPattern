package design_pattern.iterator.dinermergercafe;

import java.util.Iterator;

public class Waitress {

	Menu pancakeMenu;
	Menu dinnerMenu;
	
	public Waitress(Menu pancakeMenu,Menu dinnerMenu) {
		// TODO Auto-generated constructor stub
		this.dinnerMenu=dinnerMenu;
		this.pancakeMenu=pancakeMenu;
	}
	
	public void printMenu() {
		Iterator pancakeMenuIterator=pancakeMenu.createIterator();
		Iterator dinnerMenuIterator=dinnerMenu.createIterator();
		while(pancakeMenuIterator.hasNext()) {
			System.out.println(pancakeMenuIterator.next());
		}
		while(dinnerMenuIterator.hasNext()) {
			System.out.println(dinnerMenuIterator.next());
		}
	}
	
}
