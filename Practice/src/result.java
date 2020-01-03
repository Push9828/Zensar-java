
public class result extends test implements sports {
	
	result() { 
		super(marks1, marks2);
		
	}
	
	public float getPercentage() {
		
		 float per =  ((marks1 + marks1 + sportwt)/3);
		 return per;
	}
	
	public static void main(String[] args) {
		
		 result r = new result();
		 r.show();
		 
	}

	@Override
	public void show() {
		
		System.out.println("ID:" + student.id);
		System.out.println("Name:" + student.name);
		System.out.println("Marks in fisrt test :" + test.marks1);
		System.out.println("Marks in second test :" + test.marks2);
		System.out.println("Percentage" + getPercentage());
		
	}
	
}
