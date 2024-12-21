package oops;

interface landInfo {

	public void land4();

	public void land5();

	static void myLand() {
		System.out.println("test");
	}

	default void method() {
		System.out.println("Default");
	}

}
