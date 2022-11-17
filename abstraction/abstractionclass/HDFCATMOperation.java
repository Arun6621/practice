package java_topics.abstraction.abstractionclass;

public abstract class HDFCATMOperation {
	
	public abstract void withdrawAmount(double withdrawAmt);
	public abstract void getTransactionDetails(long acc_num);
	public abstract void depositAmount(double depositAmt);
	public void non_abstract_method() {
		System.out.println("This is a non-abstract method");
	

}
}