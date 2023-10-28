package Inheritance;

public class FITAAnnanagar extends FITATambaram {
	
	FitaBaseBranch F = new FitaBaseBranch();
	FITAAnnanagarInvoice FI = new FITAAnnanagarInvoice();
	
	String CurrentBranchName = "Annanagar";
	
	public void CurrentBranch()
	{
		System.out.println(CurrentBranchName);
	}
	public void ListOfBranch()
	{
		for(String eachbranch : F.Branches)
		{
			System.out.println(eachbranch);
		}
	
	}
	public void StudentEnquiry(String course)
	{
		for (String eachCourse : F.MainBranchCourseDetails())
		{
			if(course.equalsIgnoreCase(eachCourse))
			{
				System.out.println("Your requested course:"+course+" is available in Annanagar Branch");
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FITAAnnanagar F = new FITAAnnanagar();
		F.StudentEnquiry("Python");
		//F.Discount("yes");
	}

}
