package java_topics.abstraction.abstractionclass;

public class ATMOperation {

	public static void main(String[] args) {
		
		HDFCATMOperation icici = new ICICIDebitCard();
		
		System.out.println("======Deposit amount==========");
		icici.depositAmount(5000.0d);
		System.out.println("=======Withdrawl Amount=========");
		icici.withdrawAmount(3000.0d);
		System.out.println("========Getting latest transaction========");
		icici.getTransactionDetails(78632147);
		
		HDFCATMOperation sbi = new SBIDebitCard();
		System.out.println("======Deposit amount==========");
		sbi.depositAmount(5000.0d);
		System.out.println("=======Withdrawl Amount=========");
		sbi.withdrawAmount(4000.0d);
		System.out.println("========Getting latest transaction========");
		sbi.getTransactionDetails(8885547);
		System.out.println();
		HDFCATMOperation pnb = new PNBDebitCard();
		System.out.println("======Deposit amount==========");
		pnb.depositAmount(35000.0d);
		System.out.println("=======Withdrawl Amount=========");
		pnb.withdrawAmount(2000.0d);
		System.out.println("========Getting latest transaction========");
		pnb.getTransactionDetails(05632147);
		System.out.println();
		
		
	}

}
