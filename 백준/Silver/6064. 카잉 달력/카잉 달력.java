import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			// 기준을 x로 시작
			int year = x;
			// 최소공배수를 구한다.
			int common = lcm(M, N);
			boolean found = false;
			// 년수가 최소공배수를 넘지 않을 때 까지 조건
			while (year <= common) {
				// y == N 일때 문제가 생김
				// % N == N은 절대 성립하지 않는다 (e.g. 33 % 12 == 12 X)
				if (year % N == (y % N)) {
					System.out.println(year);
					found = true;
					break;
				}
				year += M;
			}
			if (!found) {
				System.out.println(-1);
			}
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}
}
