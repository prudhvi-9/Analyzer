package analyzer;

public class MoodAnalyzer {
	String message;

	public MoodAnalyzer(String message) {

		this.message = message;
	}

	public String analyzeMood(String message)  {

		this.message = message;

		return analyzeMood();

	}

	public String analyzeMood() {

		if (message.contains("sad")) {

			return "SAD";

		} else {

			return "HAPPY";

		}
	}
}
//	public static void isSad(String message) {
//
//		if (message.contains("Sad"))
//
//			return;
//		}
//		
//	
//
//	public static String isHappy(String message) {
//
//		if (message.contains("Happy")) {
//
//			return Happy;
//		}
//		return message;
//	}
//
//	public static void main(String[] args) {
//		Scanner cs = new Scanner(System.in);
//		String message = cs.next();
//		System.out.println(isHappy(message));
//		isSad(message);
//	}
