package designpattern.ch05singleton;

/**
 * 由于同步，导致效率很低。
 * @author ZhouHao
 * @since 2019年12月21日
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1() {};
	
	public static synchronized Singleton1 getInstance() {
		if(instance == null) {
			instance = new Singleton1();
		}
		return instance;
	}
}
