import java.io.BufferedReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                deque.add(Integer.parseInt(st.nextToken()));
            }
            else if (command.equals("pop")) {
                if (deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.poll()).append("\n");
                }
            }
            else if (command.equals("size")) {
                sb.append(deque.size()).append("\n");
            }
            else if (command.equals("empty")) {
                sb.append(deque.isEmpty() ? 1 : 0).append("\n");
            }
            else if (command.equals("front")) {
                sb.append(deque.peekFirst() == null ? -1 : deque.peekFirst()).append("\n");
            }
            else if (command.equals("back")) {
                sb.append(deque.peekLast() == null ? -1 : deque.peekLast()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}