import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		char[][] map = new char[M][N];
		boolean[][] visited = new boolean[M][N];

		int whitePower = 0;
		int bluePower = 0;

		for (int i = 0; i < M; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};


		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (!visited[i][j]) {
					char color = map[i][j];
					Queue<int[]> q = new LinkedList<>();
					q.add(new int[]{i, j});
					visited[i][j] = true;
					int count = 1;

					while (!q.isEmpty()) {
						int[] cur = q.poll();
						int curX = cur[0];
						int curY = cur[1];

						for (int k = 0; k < 4; k++) {
							int nextX = curX + dx[k];
							int nextY = curY + dy[k];

							if (nextX >= 0 && nextY < N && nextY >= 0 && nextX < M) {
								if (map[nextX][nextY] == color && !visited[nextX][nextY]) {
									visited[nextX][nextY] = true;
									count++;
									q.add(new int[]{nextX, nextY});
								}
							}
						}
					}
					if (color == 'W') {
						whitePower += count * count;
					} else {
						bluePower += count * count;
					}
				}
			}
		}
		System.out.print(whitePower + " " + bluePower);
	}
}
