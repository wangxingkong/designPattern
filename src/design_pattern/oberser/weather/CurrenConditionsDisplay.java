package design_pattern.oberser.weather;

public class CurrenConditionsDisplay implements Observer,DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	public CurrenConditionsDisplay(Subject weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("temperature:"+temperature+"  humdity="+humidity);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity=humidity;
		this.temperature=temp;
		display();
	}

}
