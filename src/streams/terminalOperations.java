package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class terminalOperations {
	
	 static void reduce(List<Integer> ls) {
    	 Optional<Integer> res = ls.stream()
    	 .reduce((i1,i2)->i1+i2);  //reduce the data into one single element 	 
    	 System.out.println(res.get());
     }
	 
	 static void collect(List<Employee> ls) {
		Map<String,List<Employee>> resGrp = ls.stream()
		 .collect(Collectors.groupingBy(Employee::getGender));
		
		 resGrp.forEach(((str,data)->{
			 System.out.println(str);
			 data.forEach(System.out::println);
		 }));
		 
		 Map<Boolean,List<Employee>> resPar = ls.stream()
				 .collect(Collectors.partitioningBy( e-> e.getSalary()>50000));
		 
		 resPar.forEach(((str,data)->{
			 System.out.println(str);
			 data.forEach(System.out::println);
		 }));
		
	 }
	 
	 static void min(List<Integer> ls) {
			final Optional<Integer> res = ls.stream()
			 .min(Comparator.naturalOrder());
		    
			System.out.println(res.get());
		 }
	 
	 static void max(List<Integer> ls) {
			final Optional<Integer> res = ls.stream()
			 .max(Comparator.naturalOrder());
		    
			System.out.println(res.get());
		 }
	 
	 static void findFirst(List<Integer> ls) {
			final Optional<Integer> res = ls.stream()
					 .findFirst();
				    
					System.out.println(res.get());
	 }
	 
	 static void anyMatch(List<Integer> ls) {
			final boolean res = ls.stream()
					 .anyMatch(x->x%2==0);
				    
					System.out.println(res);
	 }
	 
	 static void sum(List<Integer> ls) {
		  final int res = ls.stream()
		     .parallel() //use with complex operations then it will male it fast to do the operations
			 .mapToInt(Integer::intValue)
			 .sum();
		    
			System.out.println(res);
		 }
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,8,8);
		 
		 Main obj = new Main();
		 
		 List<Employee> empList = obj.getEmpList();
		 collect(empList);
	     
		 long count = ls.stream().count();
	     //System.out.println(count);
//		  reduce(ls);
//		  collect(ls);
//		  min(ls);
//		  max(ls);
//		  findFirst(ls);
//		  anyMatch(ls);
//		  sum(ls);
	}

}
