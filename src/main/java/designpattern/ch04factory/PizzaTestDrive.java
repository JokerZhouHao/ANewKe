package designpattern.ch04factory;

import designpattern.ch04factory.store.NYPizzaStore;
import designpattern.ch04factory.store.PizzaStore;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		System.out.println(nyStore.createPizza("NY").toString());
	}
}
