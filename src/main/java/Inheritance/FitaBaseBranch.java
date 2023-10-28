package Inheritance;

public class FitaBaseBranch {
	
	String[] Branches = {"Annanagar","Tmabaram","Porur"};
	
	String MainBranchName = null;
	
	public FitaBaseBranch()
	{
		this.MainBranchName="Velachery";
	}
	
	public String[] MainBranchCourseDetails()
	{
		System.out.println(MainBranchName);
		System.out.println("Below are the courses are available Here ..........");
		System.out.println("*****************");
		String[] courses = {"python","java","C#","testing"};
		/*for(String eachcourse :courses)
		{
			System.out.println(eachcourse);
		}*/
		return courses;
	}
	
	public void Discount(String discounteligible)
	{
		if(discounteligible.equalsIgnoreCase("yes"))
		{
			System.out.println("You are eligble for discount");
		}
		else
		{
			System.out.println("you are not eligible for discount");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FitaBaseBranch F = new FitaBaseBranch();
		F.MainBranchCourseDetails();
	}

}
