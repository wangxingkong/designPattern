package design_pattern.iterator.dinermergercafe;

import java.util.Iterator;

import design_pattern.iterator.dinermerger.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem>{

	MenuItem[] array;
	int postion=0;
	
	public DinerMenuIterator(MenuItem[] array) {
		// TODO Auto-generated constructor stub
		this.array=array;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(postion>=array.length||array[postion]==null)
		return false;
		return true;
	}

	@Override
	public MenuItem next() {
		// TODO Auto-generated method stub
		return array[postion++];
	}

	public void remove() {
		if(postion<=0)
			throw new IllegalStateException("you cannot remove an item until you have done at least one next()");
		if(array[postion-1]!=null) {
			for(int i=postion-1;i<(array.length-1);i++)
				array[i]=array[i+1];
			array[array.length-1]=null;
		}
	}
	
}
