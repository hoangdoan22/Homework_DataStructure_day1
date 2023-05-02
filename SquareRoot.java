package HomeworkDSday1;

public class SquareRoot {
	public static void main(String[] args) {
		double number = 20;
		System.out.println("Result of user function : " + squareRoot(number));
		System.out.println("Result of pre-function : " + Math.sqrt(number));
		System.out.println("O(n)");
	}

	public static double squareRoot(double num) {
		double temp;
		double squareRootNumber = num / 2;
		do {
			temp = squareRootNumber;
			squareRootNumber = (temp + (num / temp)) / 2;
		} while ((temp - squareRootNumber) != 0);

		return squareRootNumber;

	}
}