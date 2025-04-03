import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 나무의 개수
		int n = Integer.parseInt(st.nextToken());

		// 필요한 나무의 길이
		int m = Integer.parseInt(st.nextToken());

		// tree의 배열을 n으로 설정
		int[] tree = new int[n];
		
		st = new StringTokenizer(br.readLine());
		// 절단기 높이의 최댓값 max
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			// tree의 높이를 max로 지정 (tree의 최대 높이가 절단기 높이의 최댓값이 될 수 있음
			max = Math.max(max, tree[i]);
		}

		// 이분 탐색
		int left = 0;
		int right = max;
		int result = 0;

		while (left <= right) {
			int mid = (left + right) / 2;
			long sum = 0;
			for (int height : tree) {
				// 나무의 높이가 중간 값보다 높다면
				if (height > mid) {
					// 나무 높이의 합에서 중간 값을 뺀다.
					sum += height - mid;
				}
			}
			// 나무 높이의 합이 필요한 나무길이보다 높다면
			if (sum >= m) {
				// result를 mid에 초기화
				result = mid;
				// left를 +1 
				left = mid + 1;
			} else {
				// 나무 높이의 합이 필요한 나무길이보다 낮다면 right를 -1
				right = mid - 1;
			}
		}
		System.out.println(result);
	}
}
