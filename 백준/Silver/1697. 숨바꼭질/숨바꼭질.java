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

		// N이 0에서 100,000까지 이기 때문에 최대 값 설정
		int max = 100001;
		boolean[] visited = new boolean[max];
		Queue<int[]> q = new LinkedList<>();
		// 현재 위치와 시간 (0) q에 지정
		q.add(new int[] {n, 0});
		visited[n] = true;

		while (!q.isEmpty()) {
			int[] now = q.poll();
			int pos = now[0];
			int time = now[1];

			// 만약 원하는 위치에 도달하면 return
			if (pos == m) {
				System.out.println(time);
				return;
			}

			// 이동 범위 지정
			int[] nextPos = {pos-1, pos+1, pos*2};

			for (int nx : nextPos) {
				if (nx >= 0 && nx < max && !visited[nx]) {
					visited[nx] = true;
					q.add(new int[] {nx, time+1});
				}
			}
		}
	}
}