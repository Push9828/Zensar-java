package emp;

public class employee {

	private int empId;
	private String name;
	private float salary;
	
	private static int count;
	
	static {
		count = 0;
	}
	
	
	public employee() {
		count++;
		empId = 1001;
		name = "ABC";
		salary = 10000.00f;
		System.out.println("Default constructor of employee");
		
	}

	public employee(int empId, String name, float salary) {
		count++;
		this.empId= empId;
		this.name=name;
		this.salary=salary;
		System.out.println("Parameterized construtor of employee");
	}
	
	public void display() {
		
		System.out.println("EmpId" + empId + "\t Name:" + name +"\tSalary" + salary);
	}
	
	
	public static int totalEmployees(){
		return count;
	}
	
	
}
