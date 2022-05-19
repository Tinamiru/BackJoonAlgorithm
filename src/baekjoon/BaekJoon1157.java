package baekjoon;

import java.util.Scanner;

public class BaekJoon1157 {

//	알파벳 대소문자로 된 단어가 주어지면,
//	이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
//	단, 대문자와 소문자를 구분하지 않는다.

	public static void main(String[] args) {
		int alphNum;

		int[] alphabet = new int[24];
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String upper = str.toUpperCase();
		
		
		for (int i = 0; i < str.length(); i++) {
			alphabet[i] = str.charAt(i);
		}
		for (int i : alphabet) {
			System.out.print(i + " ");
		}

	}
}
