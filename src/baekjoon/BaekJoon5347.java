package baekjoon;

import java.util.Scanner;

public class BaekJoon5347 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int[][] array = new int[input][2];
		long[] result = new long[array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < 2; j++) {
				array[i][j] = sc.nextInt();
			}
			result[i] = lcm(array[i][0], array[i][1]);
		}

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static long lcm(int a, int b) {
		long big, small;
		if (a > b) {
			big = a;
			small = b;
		} else {
			big = b;
			small = a;
		}
		long gcd = gcd(big, small);
		long lcm = (big * small) / gcd;
		return lcm;
	}

	private static long gcd(long big, long small) {
		if (big % small == 0) {
			return small;
		}
		return gcd(small, big % small);
	}

}
