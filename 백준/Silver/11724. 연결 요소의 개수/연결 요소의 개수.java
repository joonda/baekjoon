import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 정점의 개수 n
        int N = Integer.parseInt(st.nextToken());

        // 간선의 개수 m
        int M = Integer.parseInt(st.nextToken());

        // graph 초기화
        graph = new ArrayList[N+1];

        // visited 초기화
        visited = new boolean[N + 1];

        for (int i = 1; i <= N ; i++) {
            // graph의 각 index에 배열 초기화
            graph[i] = new ArrayList<>();
        }

        // 각각 graph index에 원소를 넣는다 (연결되어진 부분)
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int count = 0;

        // 각 노드의 visited가 true가 아니라면, dfs 진행
        // 그리고 count +1 (true가 아니면 끊겨있기 때문에)
        for (int i = 1; i <= N ; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    // dfs 구현
    static void dfs(int i) {
        // visited index를 true
        visited[i] = true;

        // 만약 graph index에 있는 배열 (간선에 연결된 노드)
        for (int j : graph[i]) {
            // 각 노드의 visited 여부를 true (재귀 반복)
            if (!visited[j]) {
                dfs(j);
            }
        }
    }
}