package design_pattern.oberser.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrenConditionsDisplay currenConditionsDisplay=new CurrenConditionsDisplay(weatherData);
		StatcisDisplay statcisDisplay=new StatcisDisplay(weatherData);
		ForecastDisplay forecastDisplay=new ForecastDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
	
}
