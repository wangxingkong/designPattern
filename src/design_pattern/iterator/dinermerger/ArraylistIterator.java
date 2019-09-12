package design_pattern.iterator.dinermerger;

import java.util.ArrayList;

public class ArraylistIterator implements Iterator{

	ArrayList<MenuItem> arrayList=new ArrayList<>();
	int postion=0;
	
	public ArraylistIterator(ArrayList<MenuItem> arrayList) {
		// TODO Auto-generated constructor stub
		this.arrayList=arrayList;
	}

	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(postion>=arrayList.size()||arrayList.get(postion)==null)
					return false;
		return true;
	}

	public MenuItem next() {
		// TODO Auto-generated method stub
		return arrayList.get(postion++);
	}
	
	
	
}
