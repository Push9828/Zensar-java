class person {
	
	int	id, age;
	String name;
	
	person(int id, int age, String name){
		this.id = id;
		this.age = age;
		this.name = name;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		person other = (person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	
	
}





public class App1 {


	public static void main(String[] args) {

		 int a = 0 ,b=0;
		 double x = 2.1f , y =2.1f;
		
			person p1 = new person(20,56,"John");
			System.out.println(p1.toString());
			person p2 = new person(20,56,"John");
			System.out.println(p2.toString());
			
			
			System.out.println(p1.equals(p2));
			System.out.println(a==b);
			System.out.println(x == y);

	}

}
