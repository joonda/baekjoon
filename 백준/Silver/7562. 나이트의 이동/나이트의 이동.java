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
        int t = Integer.parseInt(br.readLine());

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {1, -1, 2, -2, 2, -2, 1, -1};

        for (int i = 0; i < t; i++) {
            int length = Integer.parseInt(br.readLine());
            boolean[][] visited = new boolean[length][length];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{startX, startY, 0});
            visited[startX][startY] = true;

            int answer = 0;

            while (!queue.isEmpty()) {
                int[] cur = queue.poll();
                int x = cur[0];
                int y = cur[1];
                int count = cur[2];

                if (x == endX && y == endY) {
                    answer = count;
                    break;
                }

                for (int d = 0; d < 8; d++) {
                    int nextX = x + dx[d];
                    int nextY = y + dy[d];
                    if (nextX >= 0 && nextX < length && nextY >= 0 && nextY < length) {
                        if (!visited[nextX][nextY]) {
                            queue.add(new int[]{nextX, nextY, count + 1});
                            visited[nextX][nextY] = true;
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }
}