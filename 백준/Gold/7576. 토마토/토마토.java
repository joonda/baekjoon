import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// 상자 가로 길이
		int M = Integer.parseInt(st.nextToken());

		// 상자 세로 길이
		int N = Integer.parseInt(st.nextToken());

		// 토마토 박스 선언
		int[][] tomatoBox = new int[N][M];

		// 익은 토마토 좌표를 넣기 위한 queue 선언
		Queue<int[]> q = new LinkedList<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				tomatoBox[i][j] = Integer.parseInt(st.nextToken());
				if (tomatoBox[i][j] == 1) {
					q.offer(new int[] { i, j });
				}
			}
		}
		// 토마토 x, y 좌표 위치
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		while (!q.isEmpty()) {
			int[] cur = q.poll();
			int curX = cur[0];
			int curY = cur[1];

			// 좌표 이동
			for (int i = 0; i < 4; i++) {
				int nextX = curX + dx[i];
				int nextY = curY + dy[i];

				// 만약 좌표가 상자의 X,Y 범위 안이고, 해당 값이 0 이라면
				if (nextX >= 0 && nextY >=0 && nextX < N && nextY < M && tomatoBox[nextX][nextY] == 0) {
					// 이전 cur 좌표에 +1을 해서 저장
					tomatoBox[nextX][nextY] = tomatoBox[curX][curY] + 1;
					q.offer(new int[] { nextX, nextY });
				}
			}
		}
		// 일수를 갱신
		int max = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tomatoBox[i][j] == 0) {
					System.out.println(-1);
					return;
				} else {
					max = Math.max(max, tomatoBox[i][j]);
				}
			}
		}
		System.out.println(max-1);
	}
}
