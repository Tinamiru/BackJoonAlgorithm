package baekjoon;

import java.util.Scanner;

public class BaekJoon14928 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.nextLine();
		sc.close();

		long result = 0;

		for (int i = 0; i < a.length(); i++) {
			result = (result * 10 + a.charAt(i) - '0') % 20000303;
		}
		System.out.println(result);

	}
}
