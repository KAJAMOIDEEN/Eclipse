package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonsComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method

		List<Persons> al = new ArrayList<>();
		al.add(new Persons("Ravi", 44));
		al.add(new Persons("Mani", 34));
		al.add(new Persons("Kumar", 29));
		al.add(new Persons("Karthik", 51));

		// sort by using comparator
		al.sort(new Comparator<Persons>() {

			@Override
			public int compare(Persons o1, Persons o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}

		});

		// sort by using lambda
		al.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

		// using comparing
		al.sort(Comparator.comparing(Persons::getName).reversed());

		for (Persons i : al) {
			System.out.println(i.getName() + " " + i.getAge());
		}

	}
}
