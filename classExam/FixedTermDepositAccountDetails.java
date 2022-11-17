package java_topics.classExam;

public class FixedTermDepositAccountDetails {

	public static void main(String[] args) {
		
		FixedTermDepositAccount account1 = new FixedTermDepositAccount();
		
		account1.setFda_acc_num(759626825);
		account1.setFda_acc_holder_name("syed parvez");
		account1.setIfsc_code(8658);
		account1.setBranch_name("Glb branch");
		account1.setFda_acc_balance(800000.0d);
		
		System.out.println("========account details==========");
		System.out.println("Account num :"+ account1.getFda_acc_num());
		System.out.println("Account holder name :"+account1.getFda_acc_holder_name());
		System.out.println("Ifsc code :"+account1.getIfsc_code());
		System.out.println("Branch name:"+account1.getBranch_name());
		System.out.println("Account balance:"+account1.getFda_acc_balance());
		
		
		
	}

}
