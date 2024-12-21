package functionalInterface;

@FunctionalInterface
public interface FunctionalInterfacess {

	// must have one abstract method
	int sqaure(int a);

	default void print() {
		System.out.println("This is Functional Interface");
	}

}
