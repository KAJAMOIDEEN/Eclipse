package assignment;

public class Main {
	
	static void displayInfo(String stuName,String staffName,String examName) {
		 System.out.println("Student Name:"+stuName+" "+"StaffName:"+staffName
	    		 +" "+"ExamName:"+examName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Student stuObj = new Student();
     Exam examObj = new Exam();
     
     displayInfo(stuObj.stu1Name,stuObj.staff1Name,examObj.exam1);
     
     
     
	}
}
