package designpattern.ch03decorator.decorator;

import designpattern.ch03decorator.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
}
