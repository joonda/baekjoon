import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                q.addLast(input);
            }
            else if (command.equals("pop")) {
                System.out.println(q.isEmpty() ? -1 : q.pop());
            }
            else if (command.equals("size")) {
                System.out.println(q.size());
            }
            else if (command.equals("empty")) {
                System.out.println(q.isEmpty() ? 1 : 0);
            }
            else if (command.equals("front")) {
                System.out.println(q.isEmpty() ? -1 : q.peekFirst());
            }
            else if (command.equals("back")) {
                System.out.println(q.isEmpty() ? -1 : q.peekLast());
            }
        }
    }
}
