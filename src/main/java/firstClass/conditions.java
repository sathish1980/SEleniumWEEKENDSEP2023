package firstClass;

public class conditions 
{
	public void SignalStatus(String signalStatus,String vehicletype,boolean patient)
	{
		if(signalStatus.equals("Red"))
		{
			if(vehicletype.equals("Ambulance") && patient==true)
			{
				
				System.out.println("You are good to go");
				
			}
			else
			{
			System.out.println("You have to stop");
			}
		}
		else if(signalStatus.equals("Green"))
		{
			System.out.println("You are good to go");
		}
		else if(signalStatus.equals("Orange"))
		{
			System.out.println("Get Ready to go");
		}
		else
		{
			System.out.println("The given color doesnot exist");
		}
	}
	/*
	 * define elgibleage globally
	 * if (age >18 and ctiizeship is india then
	 * you are eligible for voterid
	 * else if(age<18 && ctiizeship = India) then
	 * you aare not eligible at the moment please wait for 2more years
	 * else if citizenship !=India
	 * you are not elgible
	 */
	public void Gender(String code)
	{
		switch(code)
		{
		case "M":
			System.out.println("you are Male");
			break;
		case "F":
			System.out.println("you are FeMale");
			break;
		default:
			System.out.println("You are transgender");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions C =new conditions();
		//C.SignalStatus("Green");
		C.Gender("G");
	}

}
