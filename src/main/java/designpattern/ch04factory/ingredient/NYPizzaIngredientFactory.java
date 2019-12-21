package designpattern.ch04factory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	public String createDough() {
		return "NY Dough";
	}
	public String createSauce() {
		return "NY Sauce";
	}
	public String createCheese() {
		return "NY Cheese";
	}
	public String[] createPepperoni() {
		return new String[]{"NY Pepperoni1", "NY Pepperoni2"};
	}
	public String createClam() {
		return "NY Clam";
	}
}
