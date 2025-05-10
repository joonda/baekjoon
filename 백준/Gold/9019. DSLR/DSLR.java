import org.w3c.dom.Node;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int T, a, b;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            visited = new boolean[10000];
            visited[a] = true;

            Queue<Node> q = new LinkedList<>();
            q.add(new Node(a, ""));

            while (!q.isEmpty()) {
                Node cur = q.poll();
                if (cur.num == b) {
                    sb.append(cur.cmd).append("\n");;
                    break;
                }

                int d = (cur.num * 2) % 10000;
                if (!visited[d]) {
                    visited[d] = true;
                    q.add(new Node(d, cur.cmd+"D"));
                }

                int s = cur.num == 0 ? 9999 : cur.num-1;
                if (!visited[s]) {
                    visited[s] = true;
                    q.add(new Node(s, cur.cmd+"S"));
                }

                int l = (cur.num % 1000) * 10 + (cur.num / 1000);
                if (!visited[l]) {
                    visited[l] = true;
                    q.add(new Node(l, cur.cmd+"L"));
                }

                int r = (cur.num % 10) * 1000 + (cur.num / 10);
                if (!visited[r]) {
                    visited[r] = true;
                    q.add(new Node(r, cur.cmd+"R"));
                }
            }
        }
        System.out.println(sb.toString());
    }

    static class Node {
        int num;
        String cmd;

        public Node(int num, String cmd) {
            this.num = num;
            this.cmd = cmd;
        }
    }
}