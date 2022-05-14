package baekjoon;

import java.util.Scanner;

public class BaekJoon6749 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int last = sc.nextInt();
		int midle = sc.nextInt();
		int first = midle + (midle - last);
		System.out.println(first);
	}
}
