package baekjoon;

import java.util.Scanner;

public class Baekjun1373 {
//		2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
//		첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
//		첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
//		입력
//		11001100

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String num = String.valueOf(input);
		int num2_10 = Integer.parseInt(num, 2);
		String num10_8 = Integer.toOctalString(num2_10);
		int numConversion = Integer.parseInt(num10_8);
		System.out.println(numConversion);

//		Scanner sc = new Scanner(System.in);
//
//		String input = sc.nextLine();
//		String reverce = "";
//
//		int numLength = input.length();
//		int pow = 2;
//		int twoNum = 0;
//		int tenResult = 0;
//
//		for (int i = numLength - 1; i >= 0; i--) {
//			reverce += input.charAt(i);
//		}
//		for (int j = 0; j < numLength; j++) {
//			twoNum = reverce.charAt(j);
//			if (reverce.charAt(j) != 48) {
//				twoNum = 1;
//			} else {
//				twoNum = 0;
//			}
//
//			if (twoNum != 0) {
//				tenResult = tenResult + (twoNum * pow);
//			}
//			if (j != 0) {
//				pow = pow * 2;
//			}
//		}
//		System.out.println("10진수: " + tenResult);
//
//		// 8진수 변환
//		String bowl = "";
//		int ready = tenResult;
//		int ready2 = tenResult;
//
//		while (ready2 != 0) {
//			bowl += ready % 8;
//			ready2 = ready2 / 8;
//			ready = ready2;
//		}
//
//		// 숫자뒤집기
//
//		String strVer = String.valueOf(bowl); // string 변환
//		String revInput = strVer;
//		String revresult = "";
//
//		for (int i = revInput.length() - 1; i >= 0; i--) {
//			revresult += revInput.charAt(i);
//		}
//		System.out.println("8진수: " + revresult);
//		sc.close();
	}

}