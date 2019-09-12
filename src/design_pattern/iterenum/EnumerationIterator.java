package design_pattern.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object>{

	Enumeration<?> enumeration;
	
	public EnumerationIterator(Enumeration<?> enumeration) {
		// TODO Auto-generated constructor stub
		this.enumeration=enumeration;
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return enumeration.nextElement();
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
