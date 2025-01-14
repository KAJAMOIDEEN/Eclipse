package keywords;

final class ImmutableClass {

	private String name;
	private int age;

	public ImmutableClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
