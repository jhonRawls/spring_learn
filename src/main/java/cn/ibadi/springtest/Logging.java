package cn.ibadi.springtest;

public class Logging {
	public void beforeAdvice() {
		System.out.println("going to setup student profile");
	}

	public void afterAdvice() {
		System.out.println("student profile has been setup");
	}

	public void afterRetruningAdvice(Object retVal) {
		System.out.println("returing :" + retVal.toString());
	}

	public void afterThrowingAdvice(IllegalArgumentException ex) {
		System.out.println("threre has been an exception  " + ex.toString());
	}
}
