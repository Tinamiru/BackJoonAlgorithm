package baekjoon;

import java.util.Scanner;

public class Baekjoon3003 {
	public static void main(String[] args) {
		// 체스의 개수는 킹1 퀸1 룩2 비숍2 나이트2 폰8
		Scanner sc = new Scanner(System.in);

		int[] horse = new int[6];
		int[] max = { 1, 1, 2, 2, 2, 8 };
		for (int i = 0; i < horse.length; i++) {
			horse[i] = sc.nextInt();
			max[i] -= horse[i];
		}

		for (int i = 0; i < max.length; i++) {
			System.out.print(max[i] + " ");
		}

	}
}
