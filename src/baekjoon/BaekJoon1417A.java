package baekjoon;

import java.util.*;

public class BaekJoon1417A {
	public static void main(String[] args) {
//		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int candidate = sc.nextInt();
		int daSom = sc.nextInt();

		int result = 0;
		if (candidate != 1) {

			List<Integer> mList = new ArrayList();

			for (int i = 0; i < candidate - 1; i++) {
				mList.add(sc.nextInt());
			}
			int competitor = mList.get(0);
			Collections.sort(mList, Collections.reverseOrder());
			
				while (daSom <= competitor) {
					competitor = mList.set(0, competitor - 1);
					daSom++;
					result++;
					Collections.sort(mList, Collections.reverseOrder());
				}
			System.out.println(daSom);
			for (Integer string : mList) {
				System.out.println(string);
			}
			System.out.println(result);
		} else {
			System.out.println("0");
		}

//		System.out.println(list.get(candidate));
//		int result = (candidate - list.get(list.size())) * 1;

//		System.out.println(Math.abs(result));

	}
}
