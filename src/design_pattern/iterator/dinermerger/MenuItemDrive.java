package design_pattern.iterator.dinermerger;

public class MenuItemDrive {

	public static void main(String[] args) {
		BreakFastMenu menu=new BreakFastMenu();
		DinerMenu dinerMenu=new DinerMenu();
		printMenu(menu.createIterator());
		printMenu(dinerMenu.createIterator());
	}

	private static void printMenu(Iterator createIterator) {
		// TODO Auto-generated method stub
		while(createIterator.hasNext()) {
			System.out.println(createIterator.next());
		}
	}
	
}
