import java.util.ArrayList;

public class VoteProcessor {
	
	String calculateElectionWinner(ArrayList<String> a) {
		int francisCount = 0;
		int snowdenCount = 0;
		for (String string : a) {
			if(string.equalsIgnoreCase("pope francis")) {
				francisCount++;
			}
			if(string.equalsIgnoreCase("edward snowden")) {
				snowdenCount++;
			}
		}
		if(francisCount > snowdenCount) {
			return "pope francis";
		}
		if(snowdenCount > francisCount) {
			return "edward snowden";
		}
		if(francisCount == snowdenCount) {
			return "TIE";
		} else {
			return null;
		}
	}

}
