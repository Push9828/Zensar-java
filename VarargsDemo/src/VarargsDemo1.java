
public class VarargsDemo1 {

	 	void varArgMethod(int ... x)
	 	{
	 		System.out.println("Number of argumnets :" +x.length);
	 		
	 		for(int z:x)
	 		{
	 			System.out.println("Print Numbers"+""+z);
	 		}
	 	}
	
	public static void main(String[] args) {
		VarargsDemo1 addition=new VarargsDemo1();
		
		addition.varArgMethod(2,3,5);
		addition.varArgMethod(2,3);
		addition.varArgMethod(2,3,5,6);
	
	}
}
