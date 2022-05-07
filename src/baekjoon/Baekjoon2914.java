package baekjoon;

import java.util.Scanner;

public class Baekjoon2914 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int song = scanner.nextInt();
		int avg = scanner.nextInt();
		int result = ((avg - 1) * song) + 1;
		System.out.println(result);

	}
}
