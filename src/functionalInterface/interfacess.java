package functionalInterface;

import java.util.function.*;

public class interfacess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  Employee employee = new Employee("Raju",90, 50000,"Admin",5,"Chennai");
	  
	  //Boolean result (Test-method)
      Predicate<Employee> predic = str -> str.getEmpName().length()<5;
      System.out.println(predic.test(employee));
      
      //No Result (Accept Method)
      Consumer<Employee> consum = x -> x.setEmpName("Mike");
      consum.accept(employee);
      System.out.println(employee.getEmpName());
      
      //Input & Output (Apply Method)
      Function<Employee,String> func = f -> "Employeer Name:"+f.getEmpName() + "\nEmployeer Salary:" + f.getEmpSalary();
      System.out.println(func.apply(employee));
      
      ///No input only supply (get method)
      Supplier<String> supl = () -> employee.getEmpLocation();
      System.out.println(supl.get());
      
      
	}

}
