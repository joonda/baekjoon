import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        int index = 0;
        int num = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Stack<Integer> stack = new Stack<>();

        while (index < n) {
            // stack의 맨위 부분이 목표 숫자보다 크다면, 만들 수 없는 수열
            // 예시 : 1 > 2 > 5 > 3 > 4
            // 5 > 3 과정에서 문제 발생
            // push 1, pop 1, push 2, pop 2, push 3, 4, 5, pop 5 순
            // 여기서 스택 상태는 [3, 4, 5]에서 pop 5을 진행했기에 [3, 4]
            // 3을 빼내야하는데 pop으로 3을 빼낼 수 없다.
            // 그래서 break.
            if (!stack.empty() && arr[index] < stack.peek()) {
                break;
                // 만약, stack의 맨 위 부분이 목표 숫자와 동일하다면, pop()
            } else if (!stack.empty() && arr[index] == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
                index++;
            } else {
                // num이 n보다 작거나 같을 때까지 반복한다.
                while (num <= n) {
                    // 목표 숫자와 num이 같지 않다면
                    // stack에 push
                    if (arr[index] != num) {
                        stack.push(num);
                        sb.append("+").append("\n");
                        num++;
                        // 만약에 목표 숫자와 num이 같다면
                        // stack에 push 후 break.
                    } else {
                        stack.push(num);
                        sb.append("+").append("\n");
                        num++;
                        break;
                    }
                }
            }
        }
        if (index == n) {
            System.out.println(sb);
        } else {
            System.out.println("NO");
        }

    }
}