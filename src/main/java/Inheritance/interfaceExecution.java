package Inheritance;

public class interfaceExecution extends Bank implements interface1 {
	double discount =0;
	@Override
	public void discount() {
		// TODO Auto-generated method stub
		discount =0.15;
		System.out.println(discount);
	}

	@Override
	public void totaamount() {
		// TODO Auto-generated method stub
		int amount =2500;
		double discountamount = amount *discount;
		System.out.println("your discount amount is : "+discountamount);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 I = new interfaceExecution();
		//I.discount();
		I.totaamount();
		//System.out.println(I.name);
	}


	

}
