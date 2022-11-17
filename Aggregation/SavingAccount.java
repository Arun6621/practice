package java_topics.Aggregation;

public class SavingAccount {
	private long sa_acc_num;
	private String sa_acc_holder_name;
	private String sa_branch_name;
	private double sa_acc_balance;
	private ProfileDetails profileDetails;
	
	
	public SavingAccount(long sa_acc_num, String sa_acc_holder_name, String sa_branch_name, double sa_acc_balance,
			ProfileDetails profileDetails) {
		super();
		this.sa_acc_num = sa_acc_num;
		this.sa_acc_holder_name = sa_acc_holder_name;
		this.sa_branch_name = sa_branch_name;
		this.sa_acc_balance = sa_acc_balance;
		this.profileDetails = profileDetails;
	}
	public long getSa_acc_num() {
		return sa_acc_num;
	}
	public void setSa_acc_num(long sa_acc_num) {
		this.sa_acc_num = sa_acc_num;
	}
	public String getSa_acc_holder_name() {
		return sa_acc_holder_name;
	}
	public void setSa_acc_holder_name(String sa_acc_holder_name) {
		this.sa_acc_holder_name = sa_acc_holder_name;
	}
	public String getSa_branch_name() {
		return sa_branch_name;
	}
	public void setSa_branch_name(String sa_branch_name) {
		this.sa_branch_name = sa_branch_name;
	}
	public double getSa_acc_balance() {
		return sa_acc_balance;
	}
	public void setSa_acc_balance(double sa_acc_balance) {
		this.sa_acc_balance = sa_acc_balance;
	}
	public ProfileDetails getProfileDetails() {
		return profileDetails;
	}
	public void setProfileDetails(ProfileDetails profileDetails) {
		this.profileDetails = profileDetails;
	}
	@Override
	public String toString() {
		return "SavingAccount [sa_acc_num=" + sa_acc_num + ", sa_acc_holder_name=" + sa_acc_holder_name
				+ ", sa_branch_name=" + sa_branch_name + ", sa_acc_balance=" + sa_acc_balance + ", profileDetails="
				+ profileDetails + "]";
	}
}
