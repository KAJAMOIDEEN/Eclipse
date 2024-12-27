package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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
		System.out.println("\n....Repeated/duplicate value in array....");
		Arrays.stream(arr).filter(n -> !set.add(n)).forEach(System.out::println);
	}

	// convert list to map
	static void convertListToMap(List<Employee> list) {
		Map<String, String> map = list.stream().collect(Collectors.toMap(Employee::getEmpId, Employee::getFirstName));
		System.out.println("\n....converted list to map....");
		map.entrySet().stream().forEach(System.out::println);
	}

	// find maximum employee salary
	static void findMaxSalary(List<Employee> list) {
		final Optional<Integer> maximum = list.stream().map(Employee::getSalary).max(Comparator.naturalOrder());
		System.out.println("\n....Maximum Employee Salary....");
		System.out.println(maximum.get());
	}

	// find employee name of maximum salary
	static void findMaxSalaryEmpName(List<Employee> list) {
		final Optional<String> name = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(each -> each.getFirstName()).findFirst();
		System.out.println("\n....employee name of maximum salary....");
		System.out.println(name.get());
	}

	// find the count of each character in string
	static void countEachCharString(List<Employee> list) {
		System.out.println("\n....find the count of each character in string....");
		String name = list.stream().map(i -> i.getFirstName()).findFirst().get();
		System.out.println("String is:" + name);
		Map<String, Long> map = Arrays.stream(name.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(map);

	}

	// find the second max in integer array
	static void secondMax(int[] arr) {
		int res = Arrays.stream(arr).skip(1).max().getAsInt();
		System.out.println("\nSecond Maximum: " + res);
	}

	// find the longest sentence in the string
	static void longestSentence(String str) {
		System.out.println("\n....find the longest sentence in the string....");
		String res = Arrays.stream(str.split(" ")).max(Comparator.naturalOrder()).get();
		System.out.println(res);
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

		// ---------------------------------------------

		countEachCharString(empList);

		// ----------------------------------------------

		secondMax(primitiveArr);

		// -----------------------------------------------

		String str = "java is powerful language";
		longestSentence(str);
	}

}
