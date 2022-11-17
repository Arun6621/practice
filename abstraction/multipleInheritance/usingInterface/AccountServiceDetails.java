package java_topics.abstraction.multipleInheritance.usingInterface;

public class AccountServiceDetails implements AccountService,BeneficeryService{

	@Override
	public void addBenificiery() {
		System.out.println("=======Added New baneficiery to the Account======");
	}

	@Override
	public void updateBeneficiery() {
	
		System.out.println("=======Beneficiery  updated succesfully======");
	}

	@Override
	public void deleteBeneficiery() {
		System.out.println("=======Beneficiery Deleted Successfully======");
	}

	@Override
	public void getAccountDetails() {
		System.out.println("=======Account Details========");
		System.out.println("Account num :895555666");
		System.out.println("Account Holder Name :syed parvez");
		System.out.println("Branch Name :Gulbarga branch");
		System.out.println("Account Balance :500000");
				
	}

	@Override
	public void getTransactionStatement() {
		System.out.println("======= Transaction History========");
		System.out.println("200000 transfered on 23-09-2022");
		System.out.println("5000 debited in the Account on 24-02-2022");
		System.out.println("6000 credited in the Account on 17-04-2022");
		
	}

	@Override
	public void getCreditCardDetails() {
		System.out.println("=======Credit Card  Details========");
		System.out.println(" Credit card  num :755555666");
		System.out.println("Credit card  Holder Name :syed parvez");
		System.out.println("Credit card Limit :500000");
		System.out.println("Expiry Date :20-12-2028");
				
		
	}

}



