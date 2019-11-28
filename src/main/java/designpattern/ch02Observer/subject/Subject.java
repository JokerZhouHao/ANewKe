package designpattern.ch02Observer.subject;

import designpattern.ch02Observer.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}
