package Inheritance;

public class encapsualtionimplementation extends Encapsulation {
	
	public void GetAccount()
	{
		System.out.println(getaccountNumber());
		System.out.println(getAge());
		setAge(45);
		System.out.println(getAge());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		encapsualtionimplementation E = new encapsualtionimplementation();
		E.GetAccount();
	}

}
