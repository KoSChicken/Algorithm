package chapter1;

public class Chapter1 {

	public static void print2dArray(boolean[][] bArray) {
		System.out.printf("%-4s", "");
		for (int i = 0; i < bArray[0].length; i++) {
			System.out.printf("%-4d", i);
		}
		System.out.println();
		for (int i = 0; i < bArray.length; i++) {
			System.out.printf("%-4d", i);
			for (int j = 0; j < bArray[0].length; j++) {
				System.out.printf("%-4s", bArray[i][j] ? "*" : " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("===============1.1.1===============");
		System.out.println((0 + 15) / 2);
		System.out.println(2.e-6 * 100000000.1);
		System.out.println(true && false || true && true);
		System.out.println("===============1.1.2===============");
		System.out.println((1 + 2.236) / 2);
		System.out.println(1 + 2 + 3 + 4.0);
		System.out.println(4.1 >= 4);
		System.out.println(1 + 2 + "3");
		System.out.println("===============1.1.11===============");
		boolean[][] bArray = { { true, true }, { false, false }, { true, false }, { false, true } };
		print2dArray(bArray);
	}
}
