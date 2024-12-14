package oops;

public interface crud {
	
	void create();
	default void read() {
		System.out.println("Reading the data");
	}
	void update();
	void delete();

}
