package Inheritance;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("two param");
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("two param with differnt datatype");
		System.out.println(c);
	}
	
	
	public void add(int b, int a ,int d)
	{
		int c=a+b+d;
		System.out.println("three param");
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.add(2,5);
	}

}
