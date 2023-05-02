package HomeworkDSday1;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] arrNumbers = { 1, 0, 2, 2, 0, 1, 2, 1 };
		arrNumbers = sortArray(arrNumbers);
		System.out.println(Arrays.toString(arrNumbers));
		System.out.println("O(n)");
	}

	public static int[] sortArray(int[] arrNumbers) {
		int low = 0;
		int mid = 0;
		int high = arrNumbers.length - 1;
		while (mid <= high) {
			if (arrNumbers[mid] == 0) {
				arrNumbers[mid] = arrNumbers[low];
				arrNumbers[low] = 0;
				low++;
				mid++;
			} else if (arrNumbers[mid] == 1) {
				mid++;
			} else {
				arrNumbers[mid] = arrNumbers[high];
				arrNumbers[high] = 2;
				high--;
			}
		}
		return arrNumbers;
	}
}
