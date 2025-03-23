import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    // 그래프를 인접 리스트로 표현
    static List<Integer>[] graph;
    // 방문 여부 체크
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computer = Integer.parseInt(br.readLine());
        int network = Integer.parseInt(br.readLine());

        // 그래프 및 방문 배열 초기화 (1번부터 사용하므로 +1)
        graph = new ArrayList[computer+1];
        visited = new boolean[computer+1];

        // 각 컴퓨터마다 컴퓨터 정보를 저장할 리스트 생성
        for (int i = 1; i <= computer; i++) {
            graph[i] = new ArrayList<>();
        }

        // 양방향 연결 진행
        for (int i = 0; i < network; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        System.out.println(count-1);
    }

    static void dfs(int node) {
        // 현재 노드를 방문 처리
        visited[node] = true;

        // 감염 컴퓨터 수 증가
        count++;


        for (int next : graph[node]) {
            if (!visited[next]) {

                dfs(next);
            }
        }
    }
}