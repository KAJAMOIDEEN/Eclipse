package oops;

public class Cat extends Animal {

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		System.out.println("Meow Meoww");
	}

	public static void main(String args[]) {
		Cat obj = new Cat();
		obj.animalSound();
		obj.sleep();
	}

}
