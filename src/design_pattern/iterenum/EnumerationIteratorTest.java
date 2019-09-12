package design_pattern.iterenum;

import java.util.Arrays;
import java.util.Vector;

public class EnumerationIteratorTest {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>(Arrays.asList(args));
		EnumerationIterator iter = new EnumerationIterator(vector.elements());
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
