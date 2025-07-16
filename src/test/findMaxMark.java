package test;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class findMaxMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		{
//			  "student":[
//			    {
//			      "name":"student1",
//			      "mark":99,
//			      "address":"addresss",
//			      "phonenumber":9876567876,
//			      "rollnumber":"24"
//			    },{
//			      "name":"student2",
//			      "mark":98,
//			      "address":"addresss",
//			      "phonenumber":9876567876,
//			      "rollnumber":"22"
//			    }
//				]
//			}
		
		Map<String,Integer> stuData = new TreeMap();
		
		stuData.put("Mark",99);
		stuData.put("Mark", 99);
		
		
		List<Student>  list = new ArrayList<>();
		Collections.sort(list);
	    
		
		public int compare(Student o1,Student o2) {
			return o1.mark.compareTo(o2.mark);
		}
		
		
		list.add(new Arrays.asList('A','B'));
		
	}

}
