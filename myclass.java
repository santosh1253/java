package assignment;

import java.util.Scanner;

public class myclass {
	public static void main(String a[]) {
		try (Scanner s = new Scanner(System.in)) {
			String ip = s.next();
			String arr[] = ip.split(",");
			if (arr.length < 5) {
				Employee emp = new PermanentEmployee(arr[0], arr[1], arr[2], Double.valueOf(arr[3]));
				System.out.print("Employee id: " + emp.getemployeeId() + " ");
				System.out.print("Name: " + emp.getemployeeName() + " ");
				System.out.print("Department: " + emp.getdepartment() + " ");
				System.out.print("MonthSalary: " + ((PermanentEmployee) emp).getmonthSalary());
				System.out.print("Tax: " + emp.calculateTax());
			} else {
				Employee emp = new ContractEmployee(arr[0], arr[1], arr[2], Integer.parseInt(arr[3]),
						Double.valueOf(arr[4]));
				System.out.print("Employee id: " + emp.getemployeeId() + " ");
				System.out.print("Name: " + emp.getemployeeName() + " ");
				System.out.print("Department: " + emp.getdepartment() + " ");
				System.out.print("Employee contract Period: " + ((ContractEmployee) emp).getContractPeriod());
				System.out.print("Employee contract Amount: " + ((ContractEmployee) emp).getContractAmount());
				System.out.print("Tax: " + emp.calculateTax());
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
