package Inheritance;

public abstract class Course {
	
	public void Allcourses()
	{
		String[] allcourse = {"python","c#","java"};
		for(String eachcour: allcourse)
		{
			System.out.println(eachcour);
		}
	}
	
	public abstract void fees();

	

}
