package baekjoon;

import java.util.Scanner;

public class BaekJoon8370 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt(); // 비즈니스 열 수
		int k1 = sc.nextInt(); // 비즈니스 열당 좌석
		int n2 = sc.nextInt(); // 이코노미 열 수
		int k2 = sc.nextInt(); // 이코노미 열당 좌석

		int b = n1 * k1;
		int e = n2 * k2;

		System.out.println(b + e);
	}
}
