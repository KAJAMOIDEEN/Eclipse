package streams;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

	// find employee name of Second maximum salary
	static void findSecondMaxSalaryEmpName(List<Employee> list) {
		final Optional<String> name = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(each -> each.getFirstName()).skip(1).findFirst();
		System.out.println("\n....employee name of Second maximum salary....");
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

	// remove duplicate and sort employee name in employee class
	static void sortEmployee(List<Employee> list) {
		System.out.println("\n....remove duplicate and sort employee name in employee class....");
		Stream<Employee> res = list.stream().distinct().sorted(Comparator.comparing(Employee::getFirstName));
		res.forEach(i -> System.out.println(i.getFirstName()));
	}

	// Find sum of Salary
	static void sumOfSalary(List<Employee> ls) {
		System.out.println("\n....Sum of Employee Salary....");
		int sum = ls.stream().map(i -> i.getSalary()).mapToInt(Integer::intValue).sum();
		System.out.println("Sum of Salary:" + sum);
	}

	// Find product name of Given Date
	static void findProductNameOfGivenDate(List<Orders> ordersList, LocalDate date) {
		System.out.println("\n....Find the Product name of Given Date....");
		ordersList.stream().filter(order -> order.getOrder_date().equals(date))
				.flatMap(order -> order.getProduct_name().stream())
				.map(Product -> "Product Name:" + Product.getProduct_name() + "\t\t Price:" + Product.getPrice())
				.forEach(System.out::println);
	}

	// find maximum price of the product
	static void findMaxProductPrice(List<Product> productList) {
		System.out.println("\n....Find the Maximum Price of the Product....");
		Optional<Double> maxPrice = productList.stream().map(Product::getPrice).max(Comparator.naturalOrder());

		if (maxPrice.isPresent()) {
			System.out.println("Maximum Product Price: " + maxPrice.get());
		} else {
			System.out.println("Product list is empty or no prices available.");
		}
	}

	// Merge two list and sort without duplicate
	static void MergeTwoListandSort(List<Integer> list1,List<Integer> list2) {
		System.out.println("\n....Merge two list and sort without duplicate....");
		List<Integer> ls = Stream.concat(list1.stream(), list2.stream())
				.distinct()
				.sorted()
				.collect(Collectors.toList());
		
		ls.forEach(System.out::println);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main obj = new Main();
		List<Employee> empList = obj.getEmpList();
		List<Product> productList = obj.getProductList();
		List<Orders> ordersList = obj.getOrderList();
		List<Integer> list1 = new ArrayList(Arrays.asList(1,9,6,8,9));
		List<Integer> list2 = new ArrayList(Arrays.asList(2,9,8,2,3));

		Optional<LocalDate> customDate = ordersList.stream().filter(i -> i.getOrder_id() == 101)
				.map(i -> i.getOrder_date()).findFirst();
		LocalDate date = customDate.get();

		// ---------------------------------------------
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

		findSecondMaxSalaryEmpName(empList);

		// ---------------------------------------------

		countEachCharString(empList);

		// ----------------------------------------------

		secondMax(primitiveArr);

		// -----------------------------------------------

		String str = "java is powerful language";
		longestSentence(str);

		// -----------------------------------------------

		sortEmployee(empList);

		// -----------------------------------------------

		sumOfSalary(empList);

		// -----------------------------------------------

		findProductNameOfGivenDate(ordersList, date);

		// -----------------------------------------------

		findMaxProductPrice(productList);

		// -----------------------------------------------

		MergeTwoListandSort(list1,list2);

	}

}
