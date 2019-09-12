package design_pattern.iterator.dinermergercafe;

public class MenuTestDrive {

	public static void main(String[] args) {
		PancakeMenu pancakeMenu=new PancakeMenu();
		DinnerMenu dinnerMenu=new DinnerMenu();
		Waitress waitress=new Waitress(pancakeMenu, dinnerMenu);
		waitress.printMenu();
	}
	
}
