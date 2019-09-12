package design_pattern.factory.challenge;

import java.util.List;

public abstract class Calendar {

	Zone zone;
	public void print() {
		System.out.println("-----"+zone.getDisplayName());
		System.out.println("offset from GMT:"+zone.getOffset());
	}
	
	public abstract void  createCalendar(List<String> appointments);
	
}
