import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		// 층의 최대값
		int max = Integer.MIN_VALUE;

		// 층의 최소값
		int min = Integer.MAX_VALUE;

		// land 초기화
		int[][] land = new int[n + 1][m + 1];

		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= m; j++) {
				// 땅의 높이 초기화
				land[i][j] = Integer.parseInt(st.nextToken());

				// 땅의 높이의 최대값, 최소값 지정
				max = Math.max(max, land[i][j]);
				min = Math.min(min, land[i][j]);
			}
		}

		// 시간과 높이 값 지정
		int time = Integer.MAX_VALUE;
		int high = Integer.MIN_VALUE;

		for (int i = min; i <= max; i++) {
			int count = 0;
			int block = b;
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= m; k++) {
					// 각각의 땅 높이가 최소값보다 높다면
					if (land[j][k] > i) {
						// 땅 높이에 최소값을 빼고 * 2를 한다 (시간)
						count += ((land[j][k] - i) * 2);
						// block은 i를 뺀 블록을 인벤토리에 넣는다
						block += land[j][k] - i;
					} else {
						// 반대라면, 최소값에서 땅 높이를 뺀 블록만큼 위에 놓아야한다
						// time은 1배
						count += (i - land[j][k]);
						// 인벤토리에 있는 block은 줄어든다
						block -= (i - land[j][k]);
					}
				}
			}
			// 만약 block이 음수라면 종료
			if (block < 0) break;

			// time이 count보다 높다면
			if (time >= count) {
				// 계산한 count를 time에 넣는다 (최소 시간)
				time = count;
				// 높이는 i로 지정
				high = i;
			}
		}
		System.out.println(time + " " + high);
	}
}