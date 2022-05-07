package baekjoon;

import java.util.Scanner;

public class BaekJoon2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int peopleParMeter = sc.nextInt();
		int area = sc.nextInt();
		int[] participant = new int[5];
		int[] arrayResult = new int[5];
		for (int i = 0; i < participant.length; i++) {
			participant[i] = sc.nextInt();
		}
		int sangGeunResult = peopleParMeter * area;
		for (int i = 0; i < arrayResult.length; i++) {
			arrayResult[i] = sangGeunResult - participant[i];
			System.out.print(-arrayResult[i] + " ");
		}

	}
}
