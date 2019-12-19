package designpattern.ch03decorator.decorator;

import designpattern.ch03decorator.Beverage;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}
}
