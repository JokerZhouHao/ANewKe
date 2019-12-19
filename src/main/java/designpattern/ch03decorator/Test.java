package designpattern.ch03decorator;

import designpattern.ch03decorator.decorator.Mocha;
import designpattern.ch03decorator.decorator.Soy;

public class Test {

	public static void main(String[] args) {
		Beverage bev = new Espresso();
		bev = new Mocha(bev);
		bev = new Soy(bev);
		System.out.println(bev.getDescription());
		System.out.println(bev.cost());
	}

}
