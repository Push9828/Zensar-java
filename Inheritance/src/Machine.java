
public class Machine implements Info {

	int m_id ;
	String type;
	public Machine(int m_id, String type) {
		 
		this.m_id = m_id;
		this.type = type;
		
    }
	@Override
	public void showInfo() {
		Start_machine();
		System.out.println("Machine Id :" + m_id);
		System.out.println("Machine Type: " + type);
		System.out.println("We are in machine class");
		
	}

	public void Start_machine() {
		System.out.println("Machine is started");
	}
	
	
}
