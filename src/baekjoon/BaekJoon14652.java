package baekjoon;

import java.util.Scanner;

public class BaekJoon14652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		int seatNum = sc.nextInt();

		// 다차원 배열로 풀었을 경우
		// 메모리 초과
		
		/*
		 * int[][] seatList = new int[height][width];
		 * 
		 * int seatCount = 0;
		 * 
		 * for (int i = 0; i < seatList.length; i++) { for (int j = 0; j <
		 * seatList[i].length; j++) { seatList[i][j] = seatCount++; if (seatList[i][j]
		 * == seatNum) { System.out.println(i + " " + j); } } }
		 */

		System.out.println(seatNum / width + " " + seatNum % width);

	}
}
