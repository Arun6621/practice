package java_topics.abstraction.abstract_class_exm;

public class GetHomeLoanROI {
	public static void main(String[] args) {
		
		BankBazaar kotak = new KotakBank();
		BankBazaar citi = new CitiBank();
		BankBazaar union = new UnionBank();
		
		System.out.println("Home Loan rate of interest of kotak bank :"+kotak.rateOfInterest());
		System.out.println("Home Loan rate of interest of citi bank :"+citi.rateOfInterest());
		System.out.println("Home Loan rate of interest of union bank :"+union.rateOfInterest());
		System.out.println("Home Loan rate of interest of union bank :"+union.rateOfInterest());
		
		kotak.non_abstract();
		citi.non_abstract();
		union.non_abstract();
	}

}
