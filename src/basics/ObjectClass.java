package basics;

public class ObjectClass {
	String name;
	String age;

	public ObjectClass(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	// @SuppressWarnings("removal")
	@SuppressWarnings("removal")
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		String name = "java";
		String name4 = "java";
		String str = new String("java");
		String str4 = new String("java");
		ObjectClass obj = new ObjectClass("java", "24");
		System.out.println(obj.name.hashCode());
		System.out.println(str.hashCode());
		obj.finalize();
		// obj.clone();
		System.out.println(str.equals(str4));
		System.out.println(name == name4);

	}

}
