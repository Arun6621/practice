package java_topics.abstraction.abstract_EXM2;

public class GetHealthInsurance {

	public static void main(String[] args) {
		PolicyBazaar relience = new RelianceGeneralinsurance();
		PolicyBazaar  maxlife = new Maxlifeinsurance();
		PolicyBazaar aditya = new AdityaBirlaLifeInsurance();
		
		relience.GetfreeQuote();
		maxlife.GetfreeQuote();
		aditya.GetfreeQuote();
			}

}
