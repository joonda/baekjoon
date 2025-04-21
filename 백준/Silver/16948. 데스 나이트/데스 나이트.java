import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] dx = {-2, -2, 0, 0, 2, 2};
		int[] dy = {-1, 1, -2, 2, -1, 1};

		boolean[][] visited = new boolean[N][N];
		Queue<int[]> queue = new LinkedList<>();

		int r1 = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());
		int r2 = Integer.parseInt(st.nextToken());
		int c2 = Integer.parseInt(st.nextToken());

		queue.add(new int[]{r1, c1, 0});
		visited[r1][c1] = true;


		while (!queue.isEmpty()) {
			int[] cur =  queue.poll();
			int x = cur[0];
			int y = cur[1];
			int cnt = cur[2];

			if (x == r2 && y == c2) {
				System.out.println(cnt);
				return;
			}

			for (int i = 0; i < 6; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
					if (!visited[nx][ny]) {
						queue.add(new int[]{nx, ny, cnt + 1});
						visited[nx][ny] = true;
					}
				}
			}
		}
		System.out.println(-1);
	}
}
