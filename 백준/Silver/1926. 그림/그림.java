import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] paint = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                paint[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int count = 0;
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j] && paint[i][j] == 1) {
                    count++;
                    int area = 1;
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i, j});
                    visited[i][j] = true;
                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        int x = cur[0];
                        int y = cur[1];

                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (nx < 0 || ny < 0 || nx >= n || ny >= m) {
                                continue;
                            } else if (!visited[nx][ny] && paint[nx][ny] == 1) {
                                q.offer(new int[]{nx, ny});
                                visited[nx][ny] = true;
                                area++;
                            }
                        }
                    }
                    if (area > maxArea) {
                        maxArea = area;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(maxArea);
    }
}