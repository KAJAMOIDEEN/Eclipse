package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Persons implements Comparable<Persons>{
	
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Persons [name=" + name + ", age=" + age + "]";
	}

	public Persons(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
	   List<Persons> al = new ArrayList<>();
	   al.add(new Persons("Ravi",44));
	   al.add(new Persons("Mani",34));
	   al.add(new Persons("Kumar",29));
	   al.add(new Persons("Karthik",51));
	   
	   Collections.sort(al);
	   
	   for(Persons i:al) {
		   System.out.println(i.name+" "+i.age);
	   }
	   
     
	}

	
	@Override
	public int compareTo(Persons o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age,o.age);
	}


}
