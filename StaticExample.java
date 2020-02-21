package sample;
public class StaticExample {
	static {
		System.out.println("this is the first static block");
	}
	public StaticExample() {
		System.out.println("this is a constructor");
	}
	public static String staticString="Static Variable";
	static {
		System.out.println("this is the second static block and "+staticString);
	}
	public static void main(String[] args) {
		StaticExample statEx = new StaticExample();
		StaticExample.staticMethod2();
	}
	static {
		staticMethod();
		System.out.println("this is third static block");
	}
	public static void staticMethod() {
		System.out.println("this is a static method");
	}
	public static void staticMethod2() {
		System.out.println("this is a static method2");
	}

}
