//Question: Employee Management System
//Abstract Class: Employee
//
//Attributes: name (String), employeeId (int), basicSalary (double)
//Constructor: Accepts name, employeeId, and basicSalary and initializes them.
//Method: calculateSalary() – Abstract method for calculating the salary.
//Class PermanentEmployee (inherits from Employee)
//
//Additional attribute: benefits (double)
//Constructor: Accepts name, employeeId, basicSalary, and benefits.
//Overrides calculateSalary(): Returns basicSalary + benefits.
//Class ContractEmployee (inherits from Employee)
//
//Additional attribute: contractDuration (int in months)
//Constructor: Accepts name, employeeId, basicSalary, and contractDuration.
//Overrides calculateSalary(): Returns basicSalary * contractDuration.
//Main Class: Create objects of both PermanentEmployee and ContractEmployee, and call the calculateSalary() method for each.

package bannking;

abstract class Employee {
	String name;
	int employeeid;
	double basicsalary;

	public Employee(String name, int employeeid, double basicsalary) {
		this.basicsalary = basicsalary;
		this.name = name;
		this.employeeid = employeeid;

	}

	abstract double calculatesalary();

	void displayDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + employeeid);
		System.out.println("Basic Salary: " + basicsalary);
		System.out.println("Total Salary: " + calculatesalary());
	}
}

class Permanentemployee extends Employee {
	double benefits;

	public Permanentemployee(String name, int employeeid, double basicsalary, double benefits) {
		super(name, employeeid, basicsalary);
		this.benefits = benefits;

	}

	double calculatesalary() {
		return basicsalary + benefits;

	}

}

class Contractemployee extends Employee {
	int contractduration;

	public Contractemployee(String name, int employeeid, double basicsalary, int contractduration) {
		super(name, employeeid, basicsalary);
		this.contractduration = contractduration;

	}

	@Override
	double calculatesalary() {

		return basicsalary * contractduration;
	}

}

public class Employe_maganemet_system {
	public static void main(String[] args) {
		Permanentemployee p = new Permanentemployee("manu", 23, 500000, 3000);
		p.calculatesalary();
		p.displayDetails();
		System.out.println();
		Contractemployee c = new Contractemployee("shibu", 45, 30000, 2);
		c.calculatesalary();
		c.displayDetails();

	}

}
