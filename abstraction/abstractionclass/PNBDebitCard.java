package java_topics.abstraction.abstractionclass;

public class PNBDebitCard extends HDFCATMOperation{
	public double acc_balance = 25000.0d;

	@Override
	public void withdrawAmount(double withdrawAmt) {
		double withdrawl_amt = acc_balance- withdrawAmt;
		System.out.println("This is SBI withdrawl logic");
		System.out.println("Updated balance after withdrwal :"+withdrawl_amt);
		
	}

	@Override
	public void getTransactionDetails(long acc_num) {
		System.out.println("Account num :"+acc_num);
		System.out.println("Amount credited : 2000 on 21-09-2022");
		System.out.println("Amount debited : 3000 on 23-03-2022");
		System.out.println("Amount credited :1000 on 27-09-2022");
	}

	@Override
	public void depositAmount(double depositAmt) {

		double deposit_amt = acc_balance + depositAmt;
		System.out.println("This is ICICI deposit implementation logic ");
		System.out.println("Updated balance after deposit :"+deposit_amt);		
	}

}
