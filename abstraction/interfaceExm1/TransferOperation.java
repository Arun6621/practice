package java_topics.abstraction.interfaceExm1;

public class TransferOperation implements VisaCardPay {

	@Override
	public void transferWithinBank() {
		System.out.println("Money trabsfered with in bank");
		
	}

	@Override
	public void impsTransfer() {
		System.out.println("IMPS money transfered ");
		
	}

	@Override
	public void neftTransfer() {
	System.out.println("Made a NEFT Transfer ");
		
	}

	@Override
	public void visaCardPay() {
		System.out.println("You can also pay through your visa card");
		
	}
	public static void main(String[] args) {
		TransferOperation operation = new TransferOperation();
		operation.transferWithinBank();
		operation.impsTransfer();
		operation.neftTransfer();
		operation.visaCardPay();
	}
}
