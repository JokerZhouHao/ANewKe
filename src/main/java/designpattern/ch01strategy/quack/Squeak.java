package designpattern.ch01strategy.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("橡皮鸭子咯吱咯吱");
	}

}
