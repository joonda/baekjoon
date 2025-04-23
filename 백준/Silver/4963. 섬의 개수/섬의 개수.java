import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) {
                break;
            }
            int[][] grid = new int[h][w];
            boolean[][] visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    grid[i][j] = Integer.parseInt(st.nextToken());
                }
            }
            int count = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (grid[i][j] == 1 && !visited[i][j]) {
                        Queue<int[]> queue = new LinkedList<>();
                        queue.add(new int[]{i, j});
                        visited[i][j] = true;
                        while (!queue.isEmpty()) {
                            int[] cur = queue.poll();
                            int x = cur[0];
                            int y = cur[1];
                            for (int d = 0; d < 8; d++){
                                int nx = x + dx[d];
                                int ny = y + dy[d];

                                if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                                    if (grid[nx][ny] == 1 && !visited[nx][ny]) {
                                        queue.add(new int[]{nx, ny});
                                        visited[nx][ny] = true;
                                    }
                                }
                            }
                        }
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}