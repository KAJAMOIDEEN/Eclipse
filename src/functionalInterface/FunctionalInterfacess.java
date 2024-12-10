package functionalInterface;

@FunctionalInterface
public interface FunctionalInterfacess{
	
	int sqaure(int a);
    default void print() {
    	System.out.println("This is Functional Interface");
    }

}
