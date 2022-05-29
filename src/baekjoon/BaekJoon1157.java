package baekjoon;

import java.util.Scanner;

public class BaekJoon1157 {

//	알파벳 대소문자로 된 단어가 주어지면,
//	이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
//	단, 대문자와 소문자를 구분하지 않는다.

	public static void main(String[] args) {
		int[] alphabet = new int[26];
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String str = input.toUpperCase();

		for (int i = 0; i < str.length(); i++) {
			alphabet[str.charAt(i) - 'A']++;
		}
		
		char c = ' ';
		int maxChar = -1;
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] > maxChar) {
				maxChar = alphabet[i];
				c = (char) (i + 65);
			} else if (alphabet[i] == maxChar) {
				c = '?';
			}
		}
		System.out.println(c);
	}
}
