package Inheritance;

public class FITAAnnanagarInvoice extends FITAAnnanagar{
	
	public void InvoiceforCurrentMonth()
	{
		System.out.println("This is invoice for current Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FITAAnnanagarInvoice F = new FITAAnnanagarInvoice();
		F.InvoiceforCurrentMonth();
		F.CurrentBranch();
		F.StudentEnquiry("C#");
		//F.Discount("No");
	}

}
