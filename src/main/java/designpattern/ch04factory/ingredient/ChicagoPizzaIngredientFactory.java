package designpattern.ch04factory.ingredient;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	public String createDough() {
		return "Chicago Dough";
	}
	public String createSauce() {
		return "Chicago Sauce";
	}
	public String createCheese() {
		return "Chicago Cheese";
	}
	public String[] createPepperoni() {
		return new String[]{"Chicago Pepperoni1", "Chicago Pepperoni2"};
	}
	public String createClam() {
		return "Chicago Clam";
	}
}
