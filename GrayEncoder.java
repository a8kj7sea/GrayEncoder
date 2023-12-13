import java.util.Scanner;

public class GrayEncoder {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int cin;

		cin = scanner.nextInt();

		String cinInBinary = Integer.toBinaryString(cin);

		char[] binaryArray = cinInBinary.toCharArray();

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(binaryArray[0]);
		for (int x = 0; x < binaryArray.length; x++) {
			if (x < binaryArray.length - 1) {
				stringBuilder.append(xor(binaryArray[x], binaryArray[x + 1]));
			}
		}

		System.out.println("Dec : " + cin);
		System.out.println("Binary : " + cinInBinary);
		System.out.println("Gray : " + stringBuilder.toString());
	}

	private static int xor(int num1, int num2) {
		return num1 != num2 ? 1 : 0;
	}

}
