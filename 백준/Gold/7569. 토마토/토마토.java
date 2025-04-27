import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[][][] box = new int[h][n][m];
        int[] dx = {-1, 1, 0, 0, 0, 0};
        int[] dy = {0, 0, -1, 1, 0, 0};
        int[] dz = {0, 0, 0, 0, -1, 1};

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    box[i][j][k] = Integer.parseInt(st.nextToken());
                }
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (box[z][y][x] == 1) {
                        q.add(new int[]{z, y, x});
                    }
                }
            }
        }
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int z = cur[0];
            int y = cur[1];
            int x = cur[2];
            for (int d = 0; d < 6; d++) {

                int nz = z + dz[d];
                int ny = y + dy[d];
                int nx = x + dx[d];

                if (nz >= 0 && nz < h && nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    if (box[nz][ny][nx] == 0) {
                        box[nz][ny][nx] = box[z][y][x] + 1;
                        q.add(new int[]{nz, ny, nx});
                    }
                }
            }
        }
        int days = 0;
        for (int z = 0; z < h; z++) {
            for (int y = 0; y < n; y++) {
                for (int x = 0; x < m; x++) {
                    if (box[z][y][x] == 0) {
                        System.out.println(-1);
                        return;
                    }
                    days = Math.max(days, box[z][y][x]);
                }
            }
        }
        System.out.println(days-1);
    }
}