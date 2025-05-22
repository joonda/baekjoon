import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		// 해시맵 선언
		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			// 이름과 출입기록 변수에 저장
			String name = st.nextToken();
			String record = st.nextToken();

			// 만약 출입기록이 enter 라면 map 추가 (입장 기록)
			// 출입기록이 leave라면 삭제 (퇴장한 사람 기록 제거)
			if (record.equals("enter")) {
				map.put(name, record);
			} else {
				map.remove(name);
			}
		}

		// 출입 기록 남아있는 사람들을 리스트 형태로 선언
		List<String> result = new ArrayList<>(map.keySet());

		// 이름 역순 정렬
		result.sort(Collections.reverseOrder());

		for (String name : result) {
			System.out.println(name);
		}
	}
}