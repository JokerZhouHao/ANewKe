package designpattern.ch08template;

public abstract class AbstractClass {
	final void templateMethod() {
		primitiveOperation1();
		primitiveOperation2();
		concreteOperation();
		hook();
	}
	
	abstract void primitiveOperation1();
	
	abstract void primitiveOperation2();
	
	final void concreteOperation() {
		// 算法的具体实现
	}
	
	/**
	 * 可有可无，用于对外提供控制算法的操作
	 */
	void hook() {}
}
