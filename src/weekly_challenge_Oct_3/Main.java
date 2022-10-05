package weekly_challenge_Oct_3;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Valid pins");
		System.out.println();
		System.out.println("123456 - " + ValidPin.isValidPin("123456"));
		System.out.println("000000 - " + ValidPin.isValidPin("000000"));
		System.out.println("1234 - " + ValidPin.isValidPin("1234"));
		
		System.out.println("12345 - " + ValidPin.isValidPin("12345"));
		System.out.println("Empty String - " + ValidPin.isValidPin(""));
		System.out.println("1234AB - " + ValidPin.isValidPin("1234AB"));
		System.out.println();
		
		System.out.println("Factorials");
		System.out.println();
		System.out.println("1 - " + Factorial.isFactorial(1));
		System.out.println("2 - " + Factorial.isFactorial(2));
		System.out.println("6 - " + Factorial.isFactorial(6));
		System.out.println("24 - " + Factorial.isFactorial(24));
		System.out.println("120 - " + Factorial.isFactorial(120));
		System.out.println("720 - " + Factorial.isFactorial(720));
		
		System.out.println("5 - " + Factorial.isFactorial(5));
		System.out.println("10 - " + Factorial.isFactorial(10));
		System.out.println("17 - " + Factorial.isFactorial(17));
		System.out.println("333444 - " + Factorial.isFactorial(333444));

	}

}
