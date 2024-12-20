package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import datatype.datas;

public class streamProblems {

	// find group data count
	static void groupedCount(List<Employee> list) {

		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println("....Grouped data count....");
		map.forEach((str, data) -> {
			System.out.println(str);
			long count = data.stream().count();
			System.out.println(count);
		});

	}

	// find repeated value in arr
	static void findConcurrentValue(int[] arr) {

		Set<Integer> set = new HashSet<Integer>();
        System.out.println("....Repeated value in array....");
		Arrays.stream(arr).filter(n -> !set.add(n)).forEach(System.out::println);
	}

	// convert list to map
	static void convertListToMap(List<Employee> list) {
		Map<String, String> map = list.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getFirstName));
        System.out.println("....converted list to map....");
		map.entrySet().stream().forEach(System.out::println);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();
		List<Employee> empList = obj.getEmpList();
		groupedCount(empList);

		// ---------------------------------------------

		int[] primitiveArr = { 1, 2, 3, 4, 5, 7, 7, 5, 4 };
		findConcurrentValue(primitiveArr);

		// ---------------------------------------------

		convertListToMap(empList);

	}

}
