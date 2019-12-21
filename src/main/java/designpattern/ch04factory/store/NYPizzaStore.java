package designpattern.ch04factory.store;

import designpattern.ch04factory.pizza.NYStyleCheesePizza;
import designpattern.ch04factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		return new NYStyleCheesePizza();
	}

}
