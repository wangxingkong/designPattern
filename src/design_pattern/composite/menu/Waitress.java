package design_pattern.composite.menu;

public class Waitress {

	MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		// TODO Auto-generated constructor stub
		this.allMenus=allMenus;
	}
	
	public void printMenu() {
		allMenus.print();
	}
	
}
