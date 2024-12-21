package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
		System.out.println("....Repeated/duplicate value in array....");
		Arrays.stream(arr).filter(n -> !set.add(n)).forEach(System.out::println);
	}

	// convert list to map
	static void convertListToMap(List<Employee> list) {
		Map<String, String> map = list.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getFirstName));
		System.out.println("....converted list to map....");
		map.entrySet().stream().forEach(System.out::println);
	}

	// find maximum employee salary
	static void findMaxSalary(List<Employee> list) {
		final Optional<Integer> maximum = list.stream().map(Employee::getSalary).max(Comparator.naturalOrder());
		System.out.println("....Maximum Employee Salary....");
		System.out.println(maximum.get());
	}

	// find employee name of maximum salary
	static void findMaxSalaryEmpName(List<Employee> list) {
		 final Optional<String> name = list.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(each->each.getFirstName()).findFirst();
		System.out.println("....employee name of maximum salary....");
		System.out.println(name.get());
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

		// ---------------------------------------------

		findMaxSalary(empList);
		
		// ---------------------------------------------
		
		findMaxSalaryEmpName(empList);

	}

}
