package thinkinginjava.ch12exception;

class MThrowable extends Throwable {
	public String toString() {
		return "MThrowable";
	}
}

class MError extends Error {
	public String toString() {
		return "MError";
	}
}

class MException extends Exception {
	public String toString() {
		return "MException";
	}
}

class MRuntimeException extends RuntimeException {
	public String toString() {
		return "MRuntimeException";
	}
}

public class ExceptionTest {
	
	public static int testFinally() {
		try {
			throw new Exception("sss");
		} catch (Exception e) {
			return 1;
		} finally {
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args) {
		System.out.println(testFinally());
		
		
//		try {
////			throw new MError();
////			throw new MException();
//			throw new MRuntimeException();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
	}
}
