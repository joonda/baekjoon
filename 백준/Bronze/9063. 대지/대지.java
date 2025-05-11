import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		StringTokenizer st;
		// 점의 개수
		int N = Integer.parseInt(br.readLine());

		// 각 좌표의 최대와 최소 값 지정
		int xMax = -10000;
		int xMin = 10001;
		int yMax = -10000;
		int yMin = 10001;

		// N이 1일때는 넓이를 구하지 못하므로 0 출력 후 return
		if (N == 1) {
			System.out.println(0);
			return;
		}

		// N이 2 이상일때 진행
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			// 각 좌표의 최댓값, 최솟값 초기화
			if (x > xMax) {
				xMax = x;
			}
			if (x < xMin) {
				xMin = x;
			}

			if (y > yMax) {
				yMax = y;
			}
			if (y < yMin) {
				yMin = y;
			}
		}

		// 넓이는 각 좌표의 (최대 - 최소) 값을 곱한 것
		int area = (xMax - xMin) * (yMax - yMin);

		// 출력
		System.out.println(area);
	}
}