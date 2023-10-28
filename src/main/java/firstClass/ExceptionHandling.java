package firstClass;

import java.sql.SQLException;

public class ExceptionHandling {
	
	String[] name= {"sathish","kumar"};
	
	public void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
	}
	
	public void div(int a, int b)
	{
		try
		{
			int c= a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("you have entered 0 in division");
		}
		catch(Exception e)
		{
			System.out.println("Normal Exception");
		}
		finally
		{
			System.out.println("This finally block" );
		}
	}

	
	public void getName()
	{
		try
		{
		System.out.println(name[2]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void voterid(int age) throws ArithmeticException,ArrayIndexOutOfBoundsException,SQLException
	{
		if(age<18)
		{
			throw new ArithmeticException("you are lesser than 18");
		}
		else
		{
			System.out.println("you are elgible");
		}
	}
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException, SQLException {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.div(10, 5);
		E.add(3, 7);
		E.getName();
		E.voterid(16);
	}

}
