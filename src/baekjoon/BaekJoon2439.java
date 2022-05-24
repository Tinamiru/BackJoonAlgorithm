package baekjoon;

import java.util.Scanner;

public class BaekJoon2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();

        for (int i = 0; i < star; i++) {
            for (int j = star-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

