package Inheritance;

public class conditionstopic {
	
	String name ="sathish";
	boolean identified =false;
	public void comapre(String actualName , int age)
	{
		/*if(name[i].equals(actualName))
		{
			System.out.println("The food is avaialble");
			identified=true;
		}*/
		if(identified== false)
		{
		System.out.println("Your item is not avaialable at the moment");	
		}
		
		if(name.equals(actualName))
		{
			System.out.println("You are sathish");
		}
		else
		{
			System.out.println("You are not sathish and your name is : "+actualName);
		}
		if(age>15)
		{
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditionstopic C = new conditionstopic();
		//C.comapre("Hari");
	}

}
