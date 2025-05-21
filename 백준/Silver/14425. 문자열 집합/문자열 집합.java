import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		HashMap<String, Integer> strMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String str = br.readLine();

			if (strMap.containsKey(str)) {
				strMap.put(str, strMap.get(str) + 1);
			} else {
				strMap.put(str, 1);
			}
		}

		int count = 0;
		for (int i = 0; i < m; i++) {
			String str = br.readLine();

			if (strMap.get(str) != null) {
				count += 1;
			} else {
				continue;
			}
		}

		System.out.println(count);
	}
}