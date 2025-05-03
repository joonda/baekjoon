import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static int N;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void bfs (int startX, int startY, char[][] map, boolean[][] visited) {
        Queue<int[]> queue = new LinkedList<>();
        visited[startX][startY] = true;
        queue.add(new int[]{startX, startY});
        char color = map[startX][startY];

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            for (int d = 0; d < 4; d++) {
                int newX = x + dx[d];
                int newY = y + dy[d];
                if (newX >= 0 && newY >= 0 && newX < N && newY < N) {
                    if (map[newX][newY] == color && !visited[newX][newY]) {
                        queue.add(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        char[][] colorMap1 = new char[N][N];
        char[][] colorMap2 = new char[N][N];
        boolean[][] visited1 = new boolean[N][N];
        boolean[][] visited2 = new boolean[N][N];

        int area1 = 0;
        int area2 = 0;

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < line.length(); j++) {
                colorMap1[i][j] = line.charAt(j);
                if (line.charAt(j) == 'G') {
                    colorMap2[i][j] = 'R';
                } else {
                    colorMap2[i][j] = line.charAt(j);
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited1[i][j]) {
                    bfs(i, j, colorMap1, visited1);
                    area1++;
                }
                if (!visited2[i][j]) {
                    bfs(i, j, colorMap2, visited2);
                    area2++;
                }
            }
        }
        System.out.println(area1+ " " + area2);
    }
}