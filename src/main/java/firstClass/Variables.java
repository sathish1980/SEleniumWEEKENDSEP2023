package firstClass;

public class Variables {
	
	private int a=20;
	protected float b = 20.1f;
	double c = 15.23;
	char d= 'a';
	String e= "sathish";
	Boolean s =true;
	
	int[] f= {3,5,6,7,8}; //array
	
	public static int firstNumber =10; //global variable
	
	private void mul()
	{
		//int firstNumber =30;
		System.out.println(firstNumber);	
		int secondNumber =20;
		
		int c =firstNumber*secondNumber;
		System.out.println(c);	
	}
	
	protected void age()
	{
		System.out.println(firstNumber);
	}
	
	void dob()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables V = new Variables();
		V.mul();
	}

}
