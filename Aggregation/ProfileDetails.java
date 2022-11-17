package java_topics.Aggregation;

public class ProfileDetails {

	private String email_id;
	private String pan_card_num;
	private String city;
	private String state;
	private long mobile_num;
	
	
	public ProfileDetails(String email_id, String pan_card_num, String city, String state, long mobile_num) {
		super();
		this.email_id = email_id;
		this.pan_card_num = pan_card_num;
		this.city = city;
		this.state = state;
		this.mobile_num = mobile_num;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPan_card_num() {
		return pan_card_num;
	}
	public void setPan_card_num(String pan_card_num) {
		this.pan_card_num = pan_card_num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getMobile_num() {
		return mobile_num;
	}
	public void setMobile_num(long mobile_num) {
		this.mobile_num = mobile_num;
	}
	@Override
	public String toString() {
		return "ProfileDetails [email_id=" + email_id + ", pan_card_num=" + pan_card_num + ", city=" + city + ", state="
				+ state + ", mobile_num=" + mobile_num + "]";
	}
	
}
