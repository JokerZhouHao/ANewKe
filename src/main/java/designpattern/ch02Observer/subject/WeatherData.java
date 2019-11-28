package designpattern.ch02Observer.subject;

import java.util.ArrayList;
import java.util.List;

import designpattern.ch02Observer.observer.Observer;
import designpattern.ch02Observer.subject.Subject;

public class WeatherData implements Subject{
	private List<Observer> allObservers = new ArrayList();
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void registerObserver(Observer observer) {
		allObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		allObservers.remove(allObservers.indexOf(observer));
	}

	@Override
	public void notifyObservers() {
		for(Observer obs : allObservers)	
			obs.update(temperature, humidity, pressure);
	}
	
	public void measuresChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
}
