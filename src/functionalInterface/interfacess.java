package functionalInterface;

import java.util.function.*;

public class interfacess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee("Raju", 90, 50000, "Admin", 5, "Chennai");

		// Boolean result (Test-method)
		Predicate<Employee> predic = str -> str.getEmpName().length() < 5;
		System.out.println(predic.test(employee));

		// No Result (Accept Method)
		Consumer<Employee> consum = x -> x.setEmpName("Mike");
		consum.accept(employee);
		System.out.println(employee.getEmpName());

		// Only one Input & returns Output (Apply Method)
		Function<Employee, String> func = f -> "Employeer Name:" + f.getEmpName() + "\nEmployeer Salary:"
				+ f.getEmpSalary();
		System.out.println(func.apply(employee));

		// two Input & returns Output (Apply Method)
		BiFunction<Employee, Employee, String> biFunc = (f, k) -> "Employeer Name:" + f.getEmpName()
				+ "\nEmployeer Salary:" + k.getEmpSalary();
		System.out.println(biFunc.apply(employee, employee));

		/// No input and returns result(get method)
		Supplier<String> supl = () -> employee.getEmpLocation();
		System.out.println(supl.get());

	}

}
