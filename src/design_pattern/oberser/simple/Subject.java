package design_pattern.oberser.simple;

public interface Subject {

	void registerObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyObservers();
	
}
