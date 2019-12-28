package designpattern.ch09Composite;

import java.util.Iterator;

public class NullIterator implements Iterator {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Object next() {
		return null;
	}
	
}
