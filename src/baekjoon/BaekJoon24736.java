package baekjoon;

import java.util.Scanner;

public class BaekJoon24736 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t1 = new int[5];
		int[] t2 = new int[5];

		for (int i = 0; i < t1.length; i++) {
			t1[i] = sc.nextInt();
		}

		for (int i = 0; i < t2.length; i++) {
			t2[i] = sc.nextInt();
		}
		System.out.println(scoreCalc(t1));
		System.out.println(scoreCalc(t2));
	}

	private static int scoreCalc(int[] count) {
		int result = 0;

		result += count[0] * 6;
		result += count[1] * 3;
		result += count[2] * 2;
		result += count[3] * 1;
		result += count[4] * 2;

		return result;

	}
}
