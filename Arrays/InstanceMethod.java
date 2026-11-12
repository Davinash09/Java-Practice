public class InstanceEmployee {
	//instance method without return type without parameters
	public void DisplayEmployeeDetails() {
		System.out.println("Employee name is davi");
		System.out.println("Employee id is 123");
		System.out.println("Employee salary is 10k");
	}
	//instance method without return type with parameters
	public void Display(int empid , String empname ) {
		System.out.println("Employee id :"+empid);
		System.out.println("Employee name is :"+empname);
	}
	//instance method with return type and parameter
	public int DisplayAnnualSalary(int salary) {
		return salary*12;
	}
	public static void main(String[] args) {
		InstanceEmployee s1 = new InstanceEmployee();
		s1.DisplayEmployeeDetails();
		
		s1.Display(123, "Davi");
		
		int salary = s1.DisplayAnnualSalary(10000);
		System.out.println("Employee anual salary : "+salary);
	}
}
