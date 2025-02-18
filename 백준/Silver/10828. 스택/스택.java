import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) {
                int input = Integer.parseInt(st.nextToken());
                stack.push(input);
            }
            else if (command.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
            else if (command.equals("size")) {
                System.out.println(stack.size());
            }
            else if (command.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if (command.equals("top")) {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
