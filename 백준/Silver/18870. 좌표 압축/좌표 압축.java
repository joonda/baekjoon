import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		// 원본 배열과 카피 배열 선언
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			// 원본 배열과 카피 배열 만듦
			arr1[i] = Integer.parseInt(st.nextToken());
			arr2[i] = arr1[i];
		}
		// 카피 배열로 sort
		Arrays.sort(arr2);
		// Map은 Key, value 에서 Key 값이 중복이 안되기 때문에, 작은 순으로 key:value 값이 저장
		Map<Integer, Integer> map = new HashMap<>();
		int idx = 0;
		for (int i : arr2) {
			if (!map.containsKey(i)) {
				// 제일 적은 숫자 i 부터 index를 지정
				map.put(i, idx++);
			}
		}
		// 원본 배열의 숫자 i의 index를 출력
		for (int i : arr1) {
			sb.append(map.get(i)).append(" ");
		}
		System.out.println(sb.toString());
	}
}