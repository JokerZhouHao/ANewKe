package designpattern.ch07facade;

public class Car {
	Engine engine;
	
	public Car() {}
	
	/**
	 * 该提供访问子系统中一群接口的功能
	 * @param key
	 */
	public void start(Key key) {
		Doors doors = new Doors();
		
		boolean authorized = key.turns();
		
		if(authorized) {
			engine.start();
			updateDashboardDisplay();
			doors.lock();
		}
	}
	
	public void updateDashboardDisplay() {
		
	}
}
