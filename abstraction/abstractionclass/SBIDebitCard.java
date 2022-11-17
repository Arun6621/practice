package java_topics.abstraction.abstractionclass;

public class SBIDebitCard extends HDFCATMOperation{
	public double acc_balance = 15000.0d;

	@Override
	public void withdrawAmount(double withdrawAmt) {
		double withdrawl = acc_balance- withdrawAmt;
		System.out.println("This is SBI withdrawl logic");
		System.out.println("Updated balance after withdrwal :"+withdrawl);
		
	}

	@Override
	public void getTransactionDetails(long acc_num) {
	
			System.out.println("Account num :"+acc_num);
			System.out.println("Amount credited : 7000 on 21-09-2022");
			System.out.println("Amount debited : 9000 on 23-03-2022");
			System.out.println("Amount credited :5000 on 27-09-2022");
			
		}
		

	@Override
	public void depositAmount(double depositAmt) {
		double deposit = acc_balance + depositAmt;
		System.out.println("This is SBI deposit implementation logic ");
		System.out.println("Updated balance  deposit :"+deposit);
	}
	}


