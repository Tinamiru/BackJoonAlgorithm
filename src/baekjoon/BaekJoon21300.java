package baekjoon;

import java.util.Scanner;

public class BaekJoon21300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] list = new int[6];
		int result = 0;

		for (int i = 0; i < 6; i++) {
			list[i] = sc.nextInt();
			result += list[i];

		}
		System.out.println(result * 5);
	}
}
