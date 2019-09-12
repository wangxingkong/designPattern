package design_pattern.factory.challenge;

import java.util.Arrays;
import java.util.List;

public class CalendarTestDrive {

	public static void main(String[] args) {
		ZoneFactory factory=new ZoneFactory();
		Calendar calendar=new PacificCalendar(factory);
		List<String> appts=Arrays.asList("app1","app2");
		calendar.createCalendar(appts);
		calendar.print();
		
	}
	
}
