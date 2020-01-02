
public class finalEmployee {

		int empId;
		float salary;
		String name;
		final int  dept;
	
	public finalEmployee(int empId, float salary, String name) {
		
		    dept=5;
			this.empId = empId;
			this.salary = salary;
			this.name = name;
	}

	 
	void show() {
		 	
			System.out.println("EmpId: " + this.empId);
			System.out.println("Name: " + this.name);
			System.out.println("Salary: " + this.salary);
			System.out.println("Dept No: " + dept);
	}
	public static void main(String[] args) {
			
		finalEmployee fe = new finalEmployee(205,520.25f,"John doe");
		fe.show();

	}

}
