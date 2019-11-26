package designpattern.ch01strategy.duck;

import designpattern.ch01strategy.fly.FlyBehavior;
import designpattern.ch01strategy.quack.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior = null;
	private QuackBehavior quackBehavior = null;
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}

	public void swim() {
		System.out.println("游泳");
	}
	
	public abstract void display();
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
