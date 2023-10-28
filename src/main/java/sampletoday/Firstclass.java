package sampletoday;

public class Firstclass {
	
	int[] num = {1,2,3};
	protected int a1 = 01234567; 
	float a3 =2.4f;
	double a2 = 2.3343;
	char _a= 's';
	String s ="sathish";
	boolean b =true;
	
	public static int a = 30; //global or instance
	
	private Firstclass()
	{
		//int a = 10; //local
		System.out.println("I am constructor" +a);
	}
	
	public Firstclass(int a)
	{
		System.out.println("I am constructor"+a);
	}
	
	void method1()
	{
		System.out.println("sathish");
	}
	
	public void method2(String name, int age)
	{
		System.out.println("Hi! "+name+"Your age is: "+age);
	}
	
	public int method3(int dueAmount)
	{
		int overallamount = 15000; 
		int balanceAmount = overallamount-dueAmount;
		System.out.println(balanceAmount);
		return balanceAmount;
	}
	
	public void PendingInvoice(int dueAmount)
	{
		int balance = method3(dueAmount);
		if(balance>0)
		{
			System.out.println("You have to pay : "+balance);
		}
		else
		{
			System.out.println("You have payed all the amount !!");
		}
	}
	
	public void array()
	{
		System.out.println(num);
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
		
		for(int newval : num)
		{
			System.out.println(newval);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sathish");
		System.out.println("kumar");
		Firstclass obj = new Firstclass();
		obj.method1();
		obj.method2("Ram",30);
		obj.PendingInvoice(5000);
		obj.array();
	}

}
