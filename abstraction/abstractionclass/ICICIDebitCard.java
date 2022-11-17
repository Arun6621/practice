package java_topics.abstraction.abstractionclass;

public class ICICIDebitCard extends HDFCATMOperation {
	public double acc_balance = 10000.0d;

	@Override
	public void withdrawAmount(double withdrawAmt) {
		double after_withdrawAmount = acc_balance -withdrawAmt;
		System.out.println("This is ICICI Withdrawl implementation logic");
		System.out.println("Updated balance after withrawl: "+after_withdrawAmount);
		
	}

	@Override
	public void getTransactionDetails(long acc_num) {
		System.out.println("Account num :"+acc_num);
		System.out.println("Amount credited : 5000 on 21-09-2022");
		System.out.println("Amount debited : 6000 on 23-03-2022");
		System.out.println("Amount credited :7000 on 27-09-2022");
		
	}

	@Override
	public void depositAmount(double depositAmt) {
		double after_deposit = acc_balance + depositAmt;
		System.out.println("This is ICICI deposit implementation logic ");
		System.out.println("Updated balance after deposit :"+after_deposit);
	}

}
