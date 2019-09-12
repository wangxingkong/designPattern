package design_pattern.oberser.weather;public class ForecastDisplay implements Observer,DisplayElement{

	private float currentPressure=29.92f;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		// TODO Auto-generated constructor stub
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("forecast:");
		if(currentPressure>lastPressure)
			System.out.println("improving weather on the way");
		else if(currentPressure==lastPressure)
			System.out.println("more of the same");
		else if(currentPressure<lastPressure)
			System.out.println("watch out for cooler,rainy weather");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		lastPressure=currentPressure;
		currentPressure=pressure;
		display();
	}

}
