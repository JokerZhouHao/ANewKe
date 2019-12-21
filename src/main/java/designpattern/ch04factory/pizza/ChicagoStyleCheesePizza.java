package designpattern.ch04factory.pizza;

import designpattern.ch04factory.ingredient.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
	
	public ChicagoStyleCheesePizza(PizzaIngredientFactory ingredientFactory) {
		super();
		this.ingredientFactory = ingredientFactory;
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
	}
}
