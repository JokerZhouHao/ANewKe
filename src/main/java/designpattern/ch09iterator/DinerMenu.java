package designpattern.ch09iterator;

public class DinerMenu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("1", "1", false, 1.0);
		addItem("2", "2", false, 2.0);
		addItem("3", "3", true, 3.0);
		addItem("4", "4", true, 4.0);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public DinerMenuIterator iterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
