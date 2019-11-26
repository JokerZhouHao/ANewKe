package designpattern.ch01strategy.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("鸭子叫");
	}

}
