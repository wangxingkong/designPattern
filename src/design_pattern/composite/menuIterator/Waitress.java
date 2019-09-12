package design_pattern.composite.menuIterator;

import java.util.Iterator;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allMenus=allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator=allMenus.createIterator();
		while(iterator.hasNext()) {
			MenuComponent menuComponent=iterator.next();
			try {
				if(menuComponent.isVegetarian())
					menuComponent.print();
			} catch (UnsupportedOperationException  e) {
//				e.printStackTrace();
			}
		}
	}
	
}
