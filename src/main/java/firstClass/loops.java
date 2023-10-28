package firstClass;

import java.util.Scanner;

public final class loops {
	/*
	 * 
	 */
	public  void forloop(int a,int max)
	{//100
		int sub =5;
	
		final int lastfivenumber = a-sub;

		for(int i=a;i<=max;i++)
		{
			
			if(i>=50 && i <=60)
			{
				//break;
				continue;
			}
			System.out.println(i);
		}
	}
	
	public void whileloop()
	{
		int i=11;
		while(i<10)
		{
			System.out.println(i);
			i++;
		}
	}
	
	public void dowhile()
	{
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<10);
	}

	public void startandStop()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println( "Please enter the user name :");
		String username = sc.nextLine();
		System.out.println("HI !"+username + ", Welcome to FITA");
		int i=1;
		while(i<=3)
		{
		System.out.println( "Please enter the password :");
		String password = sc.nextLine();
		
		if(password.equals("Admin@123"))
		{
			System.out.println("You are sucessfully loged in");
			break;
		}
		else
		{
			if (i==3)
			{
				System.out.println("you account is locked please try some time latter");
				break;
			}
			else
			{
			System.out.println("You have entered incorrect password for "+i+" time and if u enter more 3 time then it will be locked");
			i=i+1;
			}
		}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops l = new loops();
		l.startandStop();
	}

}
