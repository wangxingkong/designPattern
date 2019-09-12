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
		pancakeHouseMenu.add(new MenuItem("ţ��", "�������ȵ�",false, 2.0f));
		pancakeHouseMenu.add(new MenuItem("����", "�ҵ��", false, 2.2f));
		dinerMenu.add(new MenuItem("�ձ�", "����������", false, 3.0f));
		dinerMenu.add(new MenuItem("ˮ��", "��һ���߲�", true, 20));
		dessertMenu.add(new MenuItem("���", "�����", false, 33));
		dessertMenu.add(new MenuItem("��Ѽ", "�Ǳ�����", false, 33));
		Waitress waitress=new Waitress(allMenu);
		waitress.printMenu();
	}
	
}
