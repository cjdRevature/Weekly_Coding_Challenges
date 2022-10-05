package weekly_challenge_Oct_3;

public class ValidPin {
	
	public static boolean isValidPin(String num) {
		
		boolean result = false;
		
		if(num.length() == 4 || num.length() == 6) {
			for(int i=0; i<num.length(); i++) {
				char character = num.charAt(i);
				if(!Character.isDigit(character)) {
					return result;
				}
			}
			
			result = true;
			return result;
			
		} else {
			return result;
		}
	}

}