package java_topics.abstraction.abstract_class_exm;

public abstract class BankBazaar {
	public BankBazaar() {
		System.out.println("Default constructor.....");
	}
	public abstract double rateOfInterest();
	public void non_abstract() {
		System.out.println("non Abstract method.....6.4");
	}
}
