package thinkinginjava.ch14typeinfo;

import java.lang.reflect.Constructor;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}

class Toy {
	Toy() {}
	Toy(int i) {}
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
	public FancyToy() { super(1); }
	public FancyToy(int x) { super(x); }
}

public class ToyTest {
	static void printInfo(Class cc) {
		System.out.println("------------------------------");
		System.out.println("Class name: " + cc.getName() + 
				" is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name: " + cc.getCanonicalName());
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		
		
		Class c = null;
		try {
			c = Class.forName("thinkinginjava.ch14typeinfo.FancyToy");
		} catch(ClassNotFoundException e) {
			System.out.println("Can't find FancyToy");
			System.exit(1);
		}
		
		System.out.println("constructor > " + c.getConstructors());
		
		printInfo(c);
		for(Class face : c.getInterfaces()) {
			printInfo(face);
		}
		
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			obj = up.newInstance();
		} catch(InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch(IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		printInfo(obj.getClass());
		
		Constructor[] conss = c.getConstructors();
		for(Constructor con : conss) {
			System.out.println(con.getParameterCount());
			if(con.getParameterCount() == 1) {
				System.out.println(con.newInstance(new Integer(1)));
			}
		}
	}
}
