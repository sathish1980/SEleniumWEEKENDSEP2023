package Inheritance;

public class MainBranch extends Course {
	
	String name = "Fita Main Branch";
	
	public void dispalydata()
	{
		System.out.println(name);
	}

	public void fees() {
		int[] allfees = {1000,2000,3000};
		for(int eachfee:allfees)
		{
			System.out.println(eachfee);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course M = new MainBranch();
		//M.dispalydata();
		M.fees();
	}

	

}
