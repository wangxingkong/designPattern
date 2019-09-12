package design_pattern.factory.challenge;

import java.util.List;

public class PacificCalendar extends Calendar{

	public PacificCalendar(ZoneFactory zoneFactory) {
		// TODO Auto-generated constructor stub
		zone=zoneFactory.createZone("US/Pacific");
	}
	
	@Override
	public void createCalendar(List<String> appointments) {
		// TODO Auto-generated method stub
		System.out.println("making the calendar");
	}

}
