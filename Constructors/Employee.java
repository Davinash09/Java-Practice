package Constructor;
public class Employee {
	int empid;
	String empName;
	String department;
	int salary;
	
	public Employee(int empid , String empName , String department , int salary) {
		this.empid = empid;
		this.empName = empName;
		this.department = department;
		this.salary = salary;
	}	
	public void display() {
		System.out.println("Employee ID: "+empid);
		System.out.println("Name: "+empName);
		System.out.println("Department Name: "+department);
		System.out.println("Salary: "+salary);
		System.out.println();
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Ravi","HR",35000);
		e1.display();
		Employee e2 = new Employee(102,"Priya","Developer",55000);
		e2.display();
		Employee e3 = new Employee(103,"Kiran","Testing",42000);
		e3.display();
	}
	
}
