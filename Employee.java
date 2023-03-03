package assignment;

public abstract class Employee {
	private String employeeId;
	private String employeeName;
	private String department;

	Employee(String id, String name, String dept) {
		employeeId = id;
		employeeName = name;
		department = dept;
	}

	public abstract double calculateTax();

	public String getemployeeId() {
		return employeeId;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public String getdepartment() {
		return department;
	}

	public String toString() {
		return String.format("%10s %20s %15s", employeeId, employeeName, department);
	}

}
