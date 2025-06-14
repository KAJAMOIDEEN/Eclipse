package functionalInterface;

@FunctionalInterface
public interface FunctionalInterfacess {

	// must have one abstract method
	int sqaure(int a);
     
	static void show() {
		System.out.println("Static method");
	}
	default void print() {
		System.out.println("This is Functional Interface");
	}

}
