package designpattern.ch07adapter;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
		System.out.println("Qauk");
	}

	@Override
	public void fly() {
		System.out.println("I'm fly");
	}

}
