import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N과 K를 int 형식으로 받는다
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 1부터 N까지 Queue에 추가한다.
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }
        sb.append("<");

        // q의 길이가 1이 될 때 까지 반복
        while (q.size() > 1) {
            // 0부터 k-1번째까지 queue의 맨 앞의 수를 맨 뒤로 옮긴다.
            for (int i = 0 ; i < K-1; i++) {
                int val = q.poll();
                q.offer(val);
            }

            // 이후 K번재 수를 입력
            sb.append(q.poll()).append(", ");
        }
        
        // q의 size가 1일때 마지막으로 해당 수를 입력
        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}