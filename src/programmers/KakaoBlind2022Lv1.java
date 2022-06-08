package programmers;

import java.util.*;

public class KakaoBlind2022Lv1 {
	public static int[] solution(String[] id_list, String[] report, int k) {

		// 입력
		int[] answer = new int[id_list.length];

		// 중복 제거
		Set<String> deduplication = new HashSet<String>();
		for (String str : report) {
			deduplication.add(str);
		}

		// 신고횟수 연산
		HashMap<String, ArrayList<String>> id = new HashMap<>();

		for (String str : deduplication) {

			String[] reportResult = str.split(" "); // report 매개변수를 id 간격으로 분할
			String reporter = reportResult[0];
			String rep = reportResult[1];

			ArrayList<String> repList = id.getOrDefault(rep, null);

			if (repList == null) { // id 배열에 키값의 캐릭터가 null값인 경우
				repList = new ArrayList<>();// 새로 생성
			}
			repList.add(reporter); // 생성한 리스트에 신고자 삽입
			id.put(rep, repList);// 값 삽입
		}

		// 신고횟수에 따른 메일 송부횟수 연산
		HashMap<String, Integer> idMailcount = new HashMap<>(); // id와 신고에 따른 메일보낼 횟수의 카운트

		for (ArrayList<String> mailingList : id.values()) { // values()로 id 배열에서 키를 제외한 값 호출
			if (mailingList.size() >= k) { // 메일보낼 리스트의 배열크기가 k이상일경우.
				for (String reporter : mailingList) { // 메일 받을 신고자
					idMailcount.put(reporter, idMailcount.getOrDefault(reporter, 0) + 1); // id에 해당하는 Integer값 카운트++
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			answer[i] = idMailcount.getOrDefault(id_list[i], 0); // id당 카운트된 메일송부 횟수 answer 배열에 삽입
		}

		return answer; // 반환
	}

	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi" };

		int k = 2;

		for (int i : solution(id_list, report, k)) {
			System.out.println(i + " ");
		}
	}
}