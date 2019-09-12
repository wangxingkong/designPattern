package design_pattern.oberser.weather;

public interface Subject {

	void  registerObserver(Observer observer);
	void removeOberser(Observer observer);
	void notifyObservers();
	
}
