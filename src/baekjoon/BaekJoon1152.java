package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BaekJoon1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		StringTokenizer sT = new StringTokenizer(str, " ");

		System.out.println(sT.countTokens());

	}
}
