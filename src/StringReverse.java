
public class StringReverse {

	public static void main(String[] args) {
		String s = "abcde";
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		StringBuilder result = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			result.append(charArray[charArray.length - i - 1]);
		}
		return result.toString();
	}
}
