package string.starts_ends;

public class StringStartdsEnds {

	public static void main(String[] args) {
		String[] words = { "samir", "samedov", "amina", "aliyeva" };
		String strStart = "sa";
		String strEnds = "va";

		startsWith(words, strStart);
		System.out.println("***********************");
		endsWith(words, strEnds);
	}

	public static void startsWith(String[] words, String str) {
		for (String s : words) {
			if (s.startsWith(str)) {
				System.out.println(s + " Starts with " + str);
			}
		}
	}

	public static void endsWith(String[] words, String str) {
		for (String s : words) {
			if (s.endsWith(str)) {
				System.out.println(s + " Ends with " + str);
			}
		}
	}

}
