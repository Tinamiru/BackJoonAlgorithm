package baekjoon;

import java.util.Scanner;

public class BaekJoon5522 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] array = new int[5];
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
			result += array[i];
		}

		System.out.println(result);

	}
}
