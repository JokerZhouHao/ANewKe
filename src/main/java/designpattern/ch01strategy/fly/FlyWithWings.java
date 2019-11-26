package designpattern.ch01strategy.fly;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("鸭子飞");
	}

}
