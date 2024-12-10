package functionalInterface;

public class Employee {
	private String empName;
	private int empid;
	private int empSalary;
	private String empRole;
	private int empRatings;
	private String empLocation;

	public Employee(String empName, int empid, int empSalary, String empRole, int empRatings, String empLocation) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
		this.empRole = empRole;
		this.empRatings = empRatings;
		this.empLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", empSalary=" + empSalary + ", empRole=" + empRole
				+ ", empRatings=" + empRatings + ", empLocation=" + empLocation + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public int getEmpRatings() {
		return empRatings;
	}

	public void setEmpRatings(int empRatings) {
		this.empRatings = empRatings;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
}
