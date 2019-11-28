package designpattern.ch02Observer.observer;

import designpattern.ch02Observer.subject.Subject;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private Subject weatherData;
	private float temperature;
	private float humidity;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		super();
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
	}

	@Override
	public void display() {
		System.out.println("Current conditaion: " + temperature + " F degrees and " + humidity + "% humidity");
	}

}
