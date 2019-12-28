package designpattern.ch09iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
	private MenuItem[] items = null;
	private int index = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		super();
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if(index < items.length) return true;
		else return false;
	}

	@Override
	public Object next() {
		if(hasNext())	return items[index++];
		return null;
	}

}
