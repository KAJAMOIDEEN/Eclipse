package streams;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Date.localDate;

public class Main {

	public static void main(String[] args) {

		Main obj = new Main();
		List<Orders> orderList = obj.getOrderList();
		// orderList.stream().forEach(System.out::println);
		for (Orders order : orderList) {
			System.out.println("Order ID: " + order.getOrder_id());
			System.out.println("Order Date: " + order.getOrder_date());
			System.out.println("Products:");
			for (Product p : order.getProduct_name()) {
				System.out.println(" - " + p.getProduct_name() + "\t" + p.getPrice());
			}
			System.out.println("------");
		}

	}

	public static List<Product> getProductList() {

		return Arrays.asList(new Product(1, "Laptop", 120000.000), new Product(2, "Smartphone", 450000.00),
				new Product(3, "TV", 80000.00), new Product(4, "AC", 60000.00));
	}

	public static List<Product> getProductList2() {

		return Arrays.asList(new Product(1, "Laptop", 120000.000), new Product(2, "Smartphone", 450000.00));
	}

	public static List<Product> getProductList3() {

		return Arrays.asList(new Product(1, "Laptop", 120000.000));
	}

	public static List<Orders> getOrderList() {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.of(2025, 05, 13);
		LocalDate date2 = LocalDate.of(2025, 04, 30);
		LocalDate date3 = LocalDate.of(2025, 05, 03);

		return Arrays.asList(new Orders(101, date1, getProductList()), new Orders(102, date2, getProductList2()),
				new Orders(103, date3, getProductList3()));
	}

	public static List<Employee> getEmpList() {
		return Arrays.asList(
				new Employee("59-385-1088", "Zacharias", "Schwerin", "zchwerin@gmail.com", "Male", "True", 101146, 0),
				new Employee("73-274-6476", "Kyle", "Frudd", "kfrudd1@ovh.net", "Male", "FALSE", 29310, 2),
				new Employee("85-939-9584", "Axe", "Gumb", "agumb2@twitter.com", "Female", "FALSE", 62291, 4),
				new Employee("08-180-8292", "Robinet", "Batterham", "rbatterham3@last.fm", "Male", "FALSE", 142439, 4),
				new Employee("21-825-2623", "Ulick", "Burrel", "uburrel4@google.ru", "Male", "FALSE", 128764, 5),
				new Employee("66-708-5539", "Tailor", "Ridding", "Ridding", "Female", "FALSE", 152924, 4),
				new Employee("81-697-2363", "Joete", "Braybrooke", "jbraybrooke6@prnewswire.com", "Male", "TRUE",
						128907, 0),
				new Employee("63-019-1110", "Elroy", "Baverstock", "ebaverstock7@ehow.com", "Male", "TRUE", 2510, 0));
	}
}
