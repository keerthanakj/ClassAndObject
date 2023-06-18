//employee

package MyPkg;

import java.util.Scanner;

class Employee {
	int employeeid,employeeage;
	double employeesalary;
	String employeename;
	
	void inputEmployeeData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		employeeid = sc.nextInt();
		System.out.println("Enter Employee Name:");
		employeename = sc.next();
		System.out.println("Enter Employee Age:");
		employeeage = sc.nextInt();
		System.out.println("enter Employee Salary:");
		employeesalary = sc.nextDouble();
	}
	void displayEmployeeData() {
		System.out.println("Employee ID:"+employeeid);
		System.out.println("Employee Name:"+employeename);
		System.out.println("Employee Age:"+employeeage);
		System.out.println("Employee Salary:"+employeesalary);
	}
}

public class MainAppEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
		Employee em=new Employee();
		System.out.println("Employee ID:"+em.employeeid);
		System.out.println("Employee Name:"+em.employeename);
		System.out.println("Employee Age:"+em.employeeage);
		System.out.println("Employee Salary:"+em.employeesalary);
		
		em.inputEmployeeData();
		em.displayEmployeeData();
	}

}
