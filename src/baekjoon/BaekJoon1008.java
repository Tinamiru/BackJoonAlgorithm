package baekjoon;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class BaekJoon1008 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigDecimal a = new BigDecimal(sc.next());
		BigDecimal b = new BigDecimal(sc.next());

		System.out.println(a.divide(b, MathContext.DECIMAL128));
	}
}
