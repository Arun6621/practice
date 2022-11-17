package java_topics.Aggregation;

public class ProfileDetailsApp {

	public static void main(String[] args) {
		
		ProfileDetails details1 = new ProfileDetails("Syed@gmail.com", "BHk78624", "Gulbarga", "Karnataka", 9426826);
		
		SavingAccount account1 = new SavingAccount(58963248, "Syed", "Glb branch", 30000.0d, details1);
		
		System.out.println(account1);
	}

}
