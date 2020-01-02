class bankA implements Bank{

	@Override
	public float getInterestRate() {
    
		
		return 9.4f;
	}
}

class bankB implements Bank{
	
	@Override
	public float getInterestRate() {
		
		return 12.2f;
	}
}

class bankC implements Bank{

	@Override
	public float getInterestRate() {
		
		return 9.8f;
	}
	
}


public class Banks {

	public static void main(String[] args) {

		Bank BA = new bankA();
		Bank BB = new bankB();
		Bank BC = new bankC();
		
		System.out.println("Bank A interest rate is: " + BA.getInterestRate());
		System.out.println("Bank B interest rate is: " + BB.getInterestRate());
		System.out.println("Bank B interest rate is: " + BC.getInterestRate());
		
	}

}
