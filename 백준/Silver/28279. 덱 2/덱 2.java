import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;

        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int command = Integer.parseInt(st.nextToken());

            if (command == 1) {
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command == 2) {
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if (command == 3) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.removeFirst()).append("\n");
                }
            } else if (command == 4) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.removeLast()).append("\n");
                }
            } else if (command == 5) {
                sb.append(deque.size()).append("\n");
            } else if (command == 6) {
                if (deque.isEmpty()) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (command == 7) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.getFirst()).append("\n");
                }
            } else if (command == 8) {
                if (deque.isEmpty()) {
                    sb.append("-1\n");
                } else {
                    sb.append(deque.getLast()).append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}