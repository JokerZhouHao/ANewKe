package thinkinginjava.ch12exception;

class BaseballException extends Exception {}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
	public Inning() throws BaseballException {}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
	
//	public void event(){}
	public void event() throws RainedOut {}
//	public void rainHard() {}
//	public void rainHard() throws RainedOut {}
}

abstract class InningExtends extends Inning{
	public InningExtends() throws BaseballException {}
	public void event() throws BaseballException {
		// Doesn't actually have to throw anything
	}
	public abstract void atBat() throws Strike, Foul;
	public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
//	public void event();
	public void event() throws RainedOut;
//	public void rainHard();
//	public void rainHard() throws RainedOut;
}

interface StormExtends extends Storm {
	public void event();
	public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm{
	public StormyInning() throws RainedOut, BaseballException{};
	public StormyInning(String s) throws Foul, BaseballException {};
	
//	void walk() throws PopFoul {};
//	public void event() throws RainedOut {};
	
	public void event() throws RainedOut {}
//	public void rainHard() throws RainedOut {};
	
	
	
	public void atBat() throws PopFoul {}
	
}
