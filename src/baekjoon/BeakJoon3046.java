package baekjoon;

import java.util.Scanner;

public class BeakJoon3046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r1 = sc.nextInt();
		int s = sc.nextInt();
		int result = -(r1 - (s * 2));

		System.out.println(result);
	}
}
