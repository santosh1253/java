package assignment;

public class ContractEmployee extends Employee {
	int contractPeriod;
	double contractAmount;
	double tax;

	ContractEmployee(String id, String name, String dept, int contractPeriod, double contractAmount) {
		super(id, name, dept);
		this.contractAmount = contractAmount;
		this.contractPeriod = contractPeriod;
	}

	@Override
	public double calculateTax() {
		tax = (contractAmount / contractPeriod) * (0.1);
		return tax;
	}

	public int getContractPeriod() {
		return contractPeriod;
	}

	public double getContractAmount() {
		return contractAmount;
	}

	public double getTax() {
		return tax;
	}

	public String toString() {
		return getemployeeId() + " " + getemployeeName() + " " + getdepartment() + " " + getContractPeriod() + " "
				+ getContractAmount() + " " + getTax();
	}

}
