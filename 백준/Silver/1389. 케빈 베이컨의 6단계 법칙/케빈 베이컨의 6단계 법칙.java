import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n + 1];

        // 각 노드에 리스트 초기화
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // 간선 입력
        for (int i =1; i<=m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        int answer = 0;
        int min = Integer.MAX_VALUE;

        // BFS 시작
        for (int i=1; i<=n; i++) {
            Queue<Integer> queue = new LinkedList<>();
            visited = new boolean[n + 1];
            // 각 순번의 친구 관계 단계의 수 (i번 사람을 시작점으로 모든 친구와의 단계의 수 저장)
            int[] dist = new int[n + 1];

            queue.add(i);
            visited[i] = true;

            while (!queue.isEmpty()) {
                int cur = queue.poll();

                for (int next : graph[cur]) {
                    if (!visited[next]) {
                        visited[next] = true;
                        dist[next] = dist[cur] + 1;
                        queue.add(next);
                    }
                }
            }
            // 합친 값 선언
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                sum += dist[j];
            }

            // 만약 최소값을 만나면 그 사람을 변수에 저장 후 출력
            if (sum < min) {
                min = sum;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}