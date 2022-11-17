package java_topics.classExam;

public class FixedTermDepositAccount {
	
	private long fda_acc_num;
	private String fda_acc_holder_name;
	private String branch_name;
	private String city;
	private int ifsc_code;
	private double fda_acc_balance;
	
	public long getFda_acc_num() {
		return fda_acc_num;
	}
	public void setFda_acc_num(long fda_acc_num) {
		this.fda_acc_num = fda_acc_num;
	}
	public String getFda_acc_holder_name() {
		return fda_acc_holder_name;
	}
	public void setFda_acc_holder_name(String fda_acc_holder_name) {
		this.fda_acc_holder_name = fda_acc_holder_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(int ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public double getFda_acc_balance() {
		return fda_acc_balance;
	}
	public void setFda_acc_balance(double fda_acc_balance) {
		this.fda_acc_balance = fda_acc_balance;
	}
}
