package designpattern.ch01strategy.duck;

import designpattern.ch01strategy.fly.FlyWithWings;
import designpattern.ch01strategy.quack.Quack;

public class RubberDuck extends Duck {
	
	public RubberDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("this is a RubberDuck");
	}

}
