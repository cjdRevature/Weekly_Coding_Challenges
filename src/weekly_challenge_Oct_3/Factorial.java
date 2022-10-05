package weekly_challenge_Oct_3;

public class Factorial {
	
	public static boolean isFactorial(int num) {
		
		boolean result = false;
		
		int i = 1;
		int product = 1;
		
		while(true) {
			product *= i;
			i++;
			if(product == num) {
				result = true;
				break;
			} else if(product > num) {
				break;
			}
			
		}
		
		return result;
	}

}
