package designpattern.ch04factory.ingredient;

public interface PizzaIngredientFactory {
	public String createDough();
	public String createSauce();
	public String createCheese();
	public String[] createPepperoni();
	public String createClam();
}
