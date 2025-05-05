import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사다리 경우의 수
        int N = Integer.parseInt(st.nextToken());

        // 뱀의 경우의 수
        int M = Integer.parseInt(st.nextToken());

        // 사다리, 뱀의 moveMap 선언
        Map<Integer, Integer> moveMap = new HashMap<>();
        int[] visited = new int[101];

        for (int i = 0; i < N + M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            moveMap.put(from, to);
        }

        // queue 선언
        Queue<Integer> queue = new LinkedList<>();

        // 현재 위치 (1)
        queue.offer(1);
        // 현재 위치 도달 횟수 초기화 (현 위치 1은 횟수가 0부터 시작)
        visited[1] = 0;
        while (!queue.isEmpty()) {
            // 지금 현재 위치
            int now = queue.poll();
            // 주사위는 1~6까지 되어있기 때문에 1부터 6까지 반복
            for (int d = 1; d <= 6; d++) {
                // 다음 위치 이동은 주사위 눈의 수를 더한다
                int next = now + d;

                // 만약 100 이상이면 continue
                if (next > 100) continue;

                if (moveMap.containsKey(next)) {
                    next = moveMap.get(next);
                }
                // next가 1이 (현재위치) 아니고, next 방문 여부가 0일때.
                if (visited[next] == 0 && next != 1) {
                    queue.offer(next);
                    visited[next] = visited[now] + 1;
                }
            }
        }
        // 100에 도착했을 때 숫자를 출력
        System.out.println(visited[100]);
    }
}