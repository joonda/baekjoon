import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] map = new int[n][m];
		for (int i = 0; i < k; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y] = 1;
		}

		boolean[][] visited = new boolean[n][m];
		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};
		int max = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1 && !visited[i][j]) {
					Queue<int[]> q = new LinkedList<>();
					q.add(new int[] {i, j});
					visited[i][j] = true;
					int count = 1;

					while (!q.isEmpty()) {
						int[] cur = q.poll();
						int curX = cur[0];
						int curY = cur[1];

						for (int l=0; l<4; l++) {
							int nowX = curX + dx[l];
							int nowY = curY + dy[l];

							if (nowX >= 0 && nowY >= 0 && nowX < n && nowY < m) {
								if (map[nowX][nowY] == 1 && !visited[nowX][nowY]) {
									q.add(new int[] {nowX, nowY});
									visited[nowX][nowY] = true;
									count++;
								}
							}
						}
						max = Math.max(max, count);
					}
				}
			}
		}
		System.out.println(max);
	}
}