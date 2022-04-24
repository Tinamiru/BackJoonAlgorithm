package baekjoon;

import java.util.Scanner;

public class BaekJoon1010 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int[][] list = new int[30][30];

		for (int i = 0; i < list.length; i++) {
			list[i][i] = 1;
			list[i][0] = 1;
		}

		for (int i = 2; i < list.length; i++) {
			for (int j = 1; j < list.length; j++) {
				list[i][j] = list[i - 1][j - 1] + list[i - 1][j];
			}
		}

		for (int i = 0; i < input; i++) {
			int r = sc.nextInt();
			int n = sc.nextInt();

			System.out.println(list[n][r]);
		}
	}
}
