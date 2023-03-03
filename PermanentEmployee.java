package assignment;

public class PermanentEmployee extends Employee {
	double monthSalary;
	double pf;
	double tax;

	PermanentEmployee(String id, String name, String dept, double monthSalary) {
		super(id, name, dept);
		this.monthSalary = monthSalary;
	}

	@Override
	public double calculateTax() {
		tax = (monthSalary * 12) * (0.1);
		return tax;
	}

	public double getPf() {
		return (0.15 * monthSalary);
	}

	public double getmonthSalary() {
		return monthSalary;
	}

	public double getTax() {
		return tax;
	}

	public String toString() {
		return String.format("%10s %10s %10s %10s",getemployeeId(),getemployeeName(),getdepartment(),getmonthSalary());
	}

}
