import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int dx[] = {0, 0, 1, -1};
		int dy[] = {-1, 1, 0, 0};

		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		String[][] grid = new String[n][m];
		boolean[][] visited = new boolean[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				grid[i][j] = String.valueOf(line.charAt(j));
			}
		}

		int initX = -1, initY = -1;
		for (int mx=0; mx<n; mx++) {
			for (int my=0; my<m; my++) {
				if (grid[mx][my].equals("I")) {
					initX = mx;
					initY = my;
					break;
				}
			}
		}

		Queue<int[]> q = new LinkedList<>();
		q.add(new int[]{initX, initY});
		visited[initX][initY] = true;

		int person = 0;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			int x = now[0];
			int y = now[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || ny < 0 || nx >= n || ny >= m || visited[nx][ny] || grid[nx][ny].equals("X")) {
					continue;
				}

				visited[nx][ny] = true;
				if (grid[nx][ny].equals("P")) {
					person++;
				}
				q.add(new int[]{nx, ny});
			}
		}
		System.out.println(person == 0 ? "TT" : person);
	}
}