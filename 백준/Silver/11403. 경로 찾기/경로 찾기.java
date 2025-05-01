import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int[][] graph;
	static int[][] result;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		graph = new int[N][N];
		result = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				graph[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			boolean[] visited = new	boolean[N];
			Queue<Integer> q = new LinkedList<>();
			q.add(i);
			while (!q.isEmpty()) {
				int current = q.poll();
				for (int j = 0; j < N; j++) {
					if (graph[current][j] == 1 && !visited[j]) {
						result[i][j] = 1;
						q.add(j);
						visited[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
