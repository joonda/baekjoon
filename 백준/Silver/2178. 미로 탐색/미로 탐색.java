import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int dx[] = {0, 0, 1, -1};
		int dy[] = {-1, 1, 0, 0};

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[][] miro = new int[n][m];
		boolean[][] visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				miro[i][j] = line.charAt(j) - '0';
			}
		}

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{0, 0});
		visited[0][0] = true;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny] || miro[nx][ny] == 0) {
					continue;
				}

                // 새로운 좌표에는 이전 값의 +1을해서 최단거리를 구한다.
				visited[nx][ny] = true;
				miro[nx][ny] = miro[x][y] + 1;
				q.add(new int[]{nx, ny});
			}
		}
		System.out.println(miro[n-1][m-1]);
	}
}