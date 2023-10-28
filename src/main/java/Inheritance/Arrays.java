package Inheritance;

public class Arrays {
	
	String[] course = {"python","java","c#","SQL","mysql"};
	
	int[] age = new int[4];
	
	public void getCourse()
	{
		System.out.println(course.length);
		for(int i=0;i<course.length;i++)
		{
			System.out.println(course[i]);
		}
		
		System.out.println(age.length);
		age[0]=20;
		age[1]=25;
		age[2]=30;
		age[3]=45;
		
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.getCourse();
	}

}
