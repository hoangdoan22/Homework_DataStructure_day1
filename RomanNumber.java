package HomeworkDSday1;

public class RomanNumber {
	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(s + " >>>>>>>>> " + convertRomanToInt(s));
		System.out.println("O(n)");
	}

	public static int defineRomanToInt(char roman) {
		if (roman == 'I') {
			return 1;
		}
		if (roman == 'V') {
			return 5;
		}
		if (roman == 'X') {
			return 10;
		}
		if (roman == 'L') {
			return 50;
		}
		if (roman == 'C') {
			return 100;
		}
		if (roman == 'D') {
			return 500;
		}
		if (roman == 'M') {
			return 1000;
		}
		return -1;
	}

	public static int convertRomanToInt(String s) {
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int romanToInt = defineRomanToInt(s.charAt(i));
			if (i < s.length() - 1) {
				int romanToInt2 = defineRomanToInt(s.charAt(i + 1));
				if (romanToInt >= romanToInt2) {
					result += romanToInt;
				} else {
					result -= romanToInt;
				}

			} else {
				result += romanToInt;
			}
		}
		return result;

	}
}
