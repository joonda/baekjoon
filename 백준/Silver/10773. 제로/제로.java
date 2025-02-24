import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Stack<Integer> stack = new Stack<>();
        // 숫자의 개수 N
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) {
                stack.pop();
            }
            else {
                stack.push(n);
            }
        }
        br.close();
        int sum = 0;
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}