package baekjoon;

import java.util.*;

public class BaekJoon1183 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int num = 0;

		List<Integer> list = new ArrayList<Integer>();
		int result = 0;

		for (int i = 0; i < b + 1; i++) {
			for (int j = 0; j < i; j++) {
				list.add(num, i);
				num++;
			}
		}
		for (int i = a - 1; i < b; i++) {
			result += (int) list.get(i);
		}
		System.out.println(result);

	}
}
