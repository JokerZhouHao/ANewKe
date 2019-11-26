package designpattern.ch01strategy.fly;

public class FlyWithNoWay implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("FlyWithNoWay");
	}
}
