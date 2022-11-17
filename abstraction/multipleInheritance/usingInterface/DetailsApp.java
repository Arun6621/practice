package java_topics.abstraction.multipleInheritance.usingInterface;

public class DetailsApp {

	public static void main(String[] args) {
		AccountServiceDetails details = new AccountServiceDetails();
		
		details.addBenificiery();
		details.deleteBeneficiery();
		details.updateBeneficiery();
		details.getAccountDetails();
		details.getTransactionStatement();
		details.getCreditCardDetails();
		
	}

}
