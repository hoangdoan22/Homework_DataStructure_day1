package HomeworkDSday1;

public class Prefix {
	public static void main(String[] args) {
		String[] arr = { "hello", "height", "help" };
		String[] arr1 = { "dog", "door", "cat" };
		System.out.println("The longest common prefix is : " + solution(arr));
		System.out.println("The longest common prefix is : " + solution(arr1));
		System.out.println("O( the length of the prefix (m) *  the number of strings in the input array (n) )");
	}

	public static String solution(String[] arr) {
		if (arr.length == 0) {
			return "There is no common prefix";
		}
		String prefix = arr[0];
		for (int i = 1; i < arr.length; i++) {
			while (arr[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "There is no common prefix";
				}
			}
		}
		return prefix;
	}
}
