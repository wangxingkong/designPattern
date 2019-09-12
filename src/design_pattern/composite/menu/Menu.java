package design_pattern.composite.menu;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{

	ArrayList<MenuComponent> menuComponents=new ArrayList<>();
	String name;
	String description;
	
	public Menu(String name,String description) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.description=description;
	}
	
	@Override
	public void add(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.add(menuComponent);
	}
	
	@Override
	public void remove(MenuComponent menuComponent) {
		// TODO Auto-generated method stub
		menuComponents.remove(menuComponent);
	}
	
	@Override
	public MenuComponent getChild(int i) {
		// TODO Auto-generated method stub
		return (MenuComponent) ( menuComponents).get(i);
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-----------------------------------");
		Iterator<MenuComponent> iterator=menuComponents.iterator();
		while(iterator.hasNext()) {
			iterator.next().print();
		}
	}
	
	
}
