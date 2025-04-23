import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int[][] banner = new int[M][N];
		boolean[][] visited = new boolean[M][N];
		int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
		int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
		int count = 0;

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				banner[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (banner[i][j] == 1 && !visited[i][j]) {
					count++;
					Queue<int[]> queue = new LinkedList<>();
					queue.add(new int[] { i, j });
					visited[i][j] = true;

					while (!queue.isEmpty()) {
						int[] cur = queue.poll();
						int x = cur[0];
						int y = cur[1];

						for (int d = 0; d < 8; d++) {
							int nx = x + dx[d];
							int ny = y + dy[d];

							if (nx >= 0 && nx < M && ny >= 0 && ny < N) {
								if (banner[nx][ny] == 1 && !visited[nx][ny]) {
									queue.add(new int[] { nx, ny });
									visited[nx][ny] = true;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(count);
	}
}
