import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스
        int t = Integer.parseInt(br.readLine());

        // 상하좌우 지정
        int[] move_x = {0, 0, -1, 1};
        int[] move_y = {-1, 1, 0, 0};

        for (int i=0; i<t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            // 가로길이
            int m = Integer.parseInt(st.nextToken());
            // 세로 길이
            int n = Integer.parseInt(st.nextToken());
            // 배추의 개수
            int k = Integer.parseInt(st.nextToken());

            // 배추 밭 지정
            int [][] grid = new int[m][n];
            // 방문 여부
            boolean [][] visited = new boolean[m][n];

            // 배추의 개수만큼 반복
            for (int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                // 배추 밭의 배추가 있는 지를 1로 표현
                grid[x][y] = 1;
            }

            // 배추가 모여져 있는 수 = 배추흰지렁이 마리 수
            int count = 0;
            for (int mx=0; mx<m; mx++) {
                for (int my=0; my<n; my++) {
                    // 만약 배추가 있고, 방문하지 않은 곳이라면
                    if (grid[mx][my] == 1 && !visited[mx][my]) {
                        // queue에 해당 배열을 넣고 방문을 true
                        Queue<int[]> q = new LinkedList<>();
                        q.add(new int[]{mx,my});
                        visited[mx][my] = true;
                        
                        while (!q.isEmpty()) {
                            // 배추가 있는 장소 배열을 queue에서 꺼낸다
                            int[] curr = q.poll();
                            // x, y를 추출
                            int currX = curr[0];
                            int currY = curr[1];

                            for (int move=0; move<4; move++) {
                                // 현재에서 상하좌우를 움직여서 newX, newY를 만든다
                                int newX = currX + move_x[move];
                                int newY = currY + move_y[move];

                                // 새로운 x, y가 0보다 크고, 각각의 가로 및 세로 길이보다 작으면 (즉 배추밭 범위 안이면)
                                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                                    // 또한 새로운 x,y 위치에 배추가 있고, 방문하지 않았던 곳이라면
                                    if (grid[newX][newY] == 1 && !visited[newX][newY]) {
                                        // queue에 해당 배열을 넣고, 방문을 true 
                                        q.add(new int[]{newX,newY});
                                        visited[newX][newY] = true;
                                    }
                                }
                            }
                        }
                        // 한 사이클이 끝날때마다 count + 1
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}