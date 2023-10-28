package firstClass;

public class FITADay1Class {
	
	
	//1. method with out parameter /arguments
	//2. method with paramters /arguments
	
	//3.method with return type
	//4.method with out return type
	// Constructor
	
	
	public FITADay1Class()
	{
		System.out.println("with out parameter constructor");
	}
	
	public FITADay1Class(int a)
	{
		System.out.println("I am constructor: " +a);
	}
	
	public FITADay1Class(String a)
	{
		System.out.println("I am constructor: " +a);
	}
	
	public void Add()
	{
		System.out.println("Addition");
	}
	
	public void AddWithParameter(String name,int days)
	{
		System.out.println(name);
		System.out.println("You have joined "+days +" back");
	}

	public double DiscountAmoiunt(int amount,double discoutpercentage)
	{
		double discountAmount = amount*discoutpercentage;
		return discountAmount;
	}
	
	public void ActualAmount(int amount , double discoutpercentage)
	{
		double discAmount = DiscountAmoiunt(amount,discoutpercentage);
		double actualAmount = amount-discAmount;
	System.out.println(actualAmount);	
	}

	public static void main(String[] a) 
	{
		FITADay1Class F = new FITADay1Class(5);
		FITADay1Class F1 = new FITADay1Class();
		
		F.Add();
		F.AddWithParameter("Welcome to FITA",30);
		
		F.ActualAmount(1000, 0.15);
	}

}
