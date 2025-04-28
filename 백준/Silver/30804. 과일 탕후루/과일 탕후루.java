import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());

		int[] fruits = new int[N];
		for (int i = 0; i < N; i++) {
			fruits[i] = Integer.parseInt(st.nextToken());
		}

		Map<Integer, Integer> map = new HashMap<>();
		int maxLength = 0;
		int left = 0;

		for (int right = 0; right < N; right++) {
			map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

			while (map.size() > 2) {
				map.put(fruits[left], map.get(fruits[left]) - 1);
				if (map.get(fruits[left]) == 0) {
					map.remove(fruits[left]);
				}
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		System.out.println(maxLength);
	}
}
