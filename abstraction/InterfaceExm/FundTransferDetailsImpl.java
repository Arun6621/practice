package java_topics.abstraction.InterfaceExm;

public class FundTransferDetailsImpl implements FundTransfer{

	@Override
	public void transferWithinBank() {
		System.out.println("=======Within the bank========");
		System.out.println("Account num :7852155666");
		System.out.println("Account Holder Name :syed parvez");
		System.out.println("Transfer Date :12-10-2022");
		System.out.println("Transfer Amount :50000");
		
	}

	@Override
	public void impsFundTransfer() {
		System.out.println("=======IMPS Fund Transfer========");
		System.out.println("Account num :895555666");
		System.out.println("Account Holder Name :syed parvez");
		System.out.println("Transfer Date :12-10-2022");
		System.out.println("Transfer Description :This is for fee");
		
	}

	@Override
	public void neftFundTransfer() {
		System.out.println("=======NEFT Fund Transfer========");
		System.out.println("Account num :895555666");
		System.out.println("Account Holder Name :syed parvez");
		System.out.println("Amount Transfer :100000");
		System.out.println("Transfer Date :09-10-2022");
		System.out.println("Transfer Description :This is for fee");
		
	}
	public static void main(String[] args) {
		FundTransfer transfer = new FundTransferDetailsImpl();
		transfer.transferWithinBank();
		transfer.impsFundTransfer();
		transfer.neftFundTransfer();
	}

}
