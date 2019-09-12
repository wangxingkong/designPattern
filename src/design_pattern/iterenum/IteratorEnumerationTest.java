package design_pattern.iterenum;

import java.util.ArrayList;
import java.util.Enumeration;

public class IteratorEnumerationTest {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("asdf");
		list.add("ddd");
		Enumeration<?> enumeration=new IteratorEnumeration(list.iterator());
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
	
}
