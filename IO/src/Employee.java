import java.io.Serializable;


public class Employee implements Serializable{

		private int empId;
			//private transient int empId;
			private String name;
			private double basicSalary;
		
		public Employee() {
			// TODO Auto-generated constructor stub
			empId = 100;
			name = "Abc";
			basicSalary = 5000.00;
		}
		
		public Employee(int empId, String name, double basicSalary) {
			super();
			this.empId = empId;
			this.name = name;
			this.basicSalary = basicSalary;
		}
		
		public void display(){
				System.out.println("EmpId: " + empId + "\tName: " + name + "\tBasic Salary: "+ basicSalary);
		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", name=" + name + ", basicSalary=" + basicSalary + "]";
		}


}