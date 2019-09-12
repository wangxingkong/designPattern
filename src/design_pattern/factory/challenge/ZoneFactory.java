package design_pattern.factory.challenge;

public class ZoneFactory {

	public Zone createZone(String zoneId) {
		Zone zone=null;
		if(zoneId=="US/Pacific")
			zone=new ZonePacific();
		else if(zoneId=="US/Mountain")
			zone=new ZoneMountain();
		return zone;
	}
	
}
