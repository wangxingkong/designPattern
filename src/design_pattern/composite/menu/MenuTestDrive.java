package design_pattern.composite.menu;

public class MenuTestDrive {

	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu=new Menu("panacakeHouseMenu", "zaocan");
		MenuComponent dinerMenu=new Menu("dinner", "wucan");
		MenuComponent cafeMenu=new Menu("cafe menu", "wancan");
		MenuComponent dessertMenu=new Menu("dessert menu", "dessert of course");
		MenuComponent allMenu=new Menu("all menus", "all menu combined");
		allMenu.add(pancakeHouseMenu);
		allMenu.add(dinerMenu);
		allMenu.add(cafeMenu);
		allMenu.add(dessertMenu);
		pancakeHouseMenu.add(new MenuItem("牛奶", "是用来喝的",false, 2.0f));
		pancakeHouseMenu.add(new MenuItem("豆奶", "我的最爱", false, 2.2f));
		dinerMenu.add(new MenuItem("烧饼", "是用来烤的", false, 3.0f));
		dinerMenu.add(new MenuItem("水果", "是一种蔬菜", true, 20));
		dessertMenu.add(new MenuItem("甜点", "是甜的", false, 33));
		dessertMenu.add(new MenuItem("烤鸭", "是北京的", false, 33));
		Waitress waitress=new Waitress(allMenu);
		waitress.printMenu();
	}
	
}
