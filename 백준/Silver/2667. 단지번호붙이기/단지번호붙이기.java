import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 정수 n 받음
		int n = Integer.parseInt(br.readLine());
		// 단지 지도 matrix 선언
		int[][] matrix = new int[n][n];
		// 방문 여부
		boolean[][] visited = new boolean[n][n];
		// 단지 사이즈 배열 지정
		List<Integer> buildingSizes = new LinkedList<>();

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				// 각 0과 1을 받아서 matrix에 넣는다.
				matrix[i][j] = line.charAt(j) - '0';
			}
		}

		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// 만약 방문하지 않았고, matrix 값이 1이라면
				if(!visited[i][j] && matrix[i][j] == 1) {
					// queue 선언
					Queue<int[]> queue = new LinkedList<>();
					// queue에 현재 좌표를 넣는다.
					queue.add(new int[]{i, j});
					// 현재 좌표를 true
					visited[i][j] = true;
					// 단지 인원 count
					int count = 1;
					while (!queue.isEmpty()) {
						// 현재 위치를 꺼낸다
						int[] cur = queue.poll();
						// 현재 위치 상하좌우를 차례대로 넣는다.
						for (int k = 0; k < 4; k++) {
							int nx = cur[0] + dx[k];
							int ny = cur[1] + dy[k];
							// 만약 nx, ny가 0보다 크거나 같고, 최대 길이보다 작다면
							if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
								// 그리고 해당 곳을 방문하지 않고, 해당 값이 1이라면
								if (!visited[nx][ny] && matrix[nx][ny] == 1) {
									// queue에 해당 위치를 넣는다
									queue.add(new int[]{nx, ny});
									// 그리고 해당 위치를 방문한 것으로 체크
									visited[nx][ny] = true;
									// 단지 인원 +1
									count++;
								}
							}
						}
					}
					buildingSizes.add(count);
				}
			}
		}
		System.out.println(buildingSizes.size());
		Collections.sort(buildingSizes);
		for (int i = 0; i < buildingSizes.size(); i++) {
			System.out.println(buildingSizes.get(i));
		}
	}
}
