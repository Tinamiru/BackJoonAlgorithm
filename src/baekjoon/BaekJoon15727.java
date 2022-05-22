package baekjoon;

import java.util.Scanner;

public class BaekJoon15727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int distance = sc.nextInt();
		int result = distance / 5;

		if (distance % 5 > 0) {
			result++;
		}
		System.out.println(result);

	}
}
