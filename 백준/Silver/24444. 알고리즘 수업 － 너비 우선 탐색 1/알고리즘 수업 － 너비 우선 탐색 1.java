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
        int r = Integer.parseInt(st.nextToken());

        // graph 선언
        // 정점 번호를 그대로 인덱스를 쓰기 위해서 n+1 배열로 제작
        List<Integer>[] graph = new ArrayList[n+1];

        for (int i = 1; i <= n; i++) {
            // 각 정점 번호에 연결되어있는 정점들을 담는 리스트를 넣는다
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            // 입력으로 간선 번호를 받는다.
            st = new StringTokenizer(br.readLine());
            // 정점 u와 정점 v를 받는다
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            // 연결된 u, v를 graph[index]에 넣는다.
            graph[u].add(v);
            graph[v].add(u);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(graph[i]);
        }

        // 방문한 곳을 true/false로 체크
        boolean[] visited = new boolean[n+1];

        // 각 정점의 방문 순서를 알기 위해서 배열을 선언
        int[] order = new int[n+1];

        // 방문 순서
        int count = 1;

        // queue 선언
        Queue<Integer> q = new LinkedList<>();
        // q에서 맨 처음 방문한 정점을 넣는다.
        q.add(r);
        // 방문 했는지 여부를 T/F 저장
        visited[r] = true;
        // 맨 처음 방문한 index에 1번을 넣는다 (증감 연산자로 인해 ++이 된다)
        order[r] = count++;

        while (!q.isEmpty()) {
            // 해당 queue에서 빼온 시작점
            int u = q.poll();
            // 시작점에 인접한 요소를 빼온다.
            for (int next : graph[u]) {
                // 만약 인접한 요소가 visited false 라면
                if (!visited[next]) {
                    // 해당 요소를 방문했으니 true로 변경
                    visited[next] = true;
                    // 해당 요소를 방문 예정인 queue에 넣는다.
                    q.add(next);
                    // 방문한 index에 다음 순번으로 count를 넣는다
                    order[next] = count++;
                }
            }
        }
        // 각 order 순서를 출력
        for (int i = 1; i<=n; i++) {
            System.out.println(order[i]);
        }
    }
}