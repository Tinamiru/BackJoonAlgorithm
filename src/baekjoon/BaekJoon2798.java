package baekjoon;

import java.util.Scanner;
import java.util.Arrays;

public class BaekJoon2798 {

	public static void main(String[] args) {
//		각 N과 M카드에는 양의 정수가 쓰여 있다.
//		그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다.
//		그런 후에 딜러는 숫자 M을 크게 외친다.
//		이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라
//		고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//		N장의 카드에 써져 있는 숫자가 주어졌을 때, M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

//		5 100
//		25 30 45 15 20
		Scanner scanner = new Scanner(System.in);

		// 구현 - 카드수, 딜러패, 카드 수만큼의 배열, 배열 내의 값
		int cardVal = scanner.nextInt();
		int dealerCard = scanner.nextInt();
		int result = 0;
		int[] cardArray = new int[cardVal];
		for (int i = 0; i < cardVal; i++) {
			cardArray[i] += scanner.nextInt();
		}
		

		System.out.println("카드수: " + cardVal);
		System.out.println("카드의 수들: " + Arrays.toString(cardArray));
		System.out.println("딜러의 패: " + dealerCard);
		
		
	}

}
