package Inheritance;

public class SBI extends Bank{
	
	public double interestRate()
	{
		return 0.13;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI S = new SBI();
		System.out.println(S.interestRate());
		System.out.println(S.name);
	}

}
