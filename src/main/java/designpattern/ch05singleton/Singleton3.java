package designpattern.ch05singleton;

/**
 * 双重检查锁不适用与Java 1.4及以前的版本，因为volatile实现的原因
 * @author ZhouHao
 * @since 2019年12月21日
 */
public class Singleton3 {
	private volatile static Singleton3 instance = new Singleton3();
	
	private Singleton3() {};
	
	public static Singleton3 getInstance() {
		if(instance == null) {
			synchronized (Singleton3.class) {
				if(instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}
}
