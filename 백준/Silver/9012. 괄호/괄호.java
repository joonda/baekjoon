import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            System.out.println(isValid(s) ? "YES" : "NO");
        }
    }

    public static boolean isValid(String s) {
        // 문자 스택 선언
        Stack<Character> stack = new Stack<>();
        // 입력된 문자열 확인
        for (int i = 0; i < s.length(); i++) {
            // 문자열의 문자를 순차적으로 확인
            // 문자가 '(' 일때는 그대로 push
            if (s.charAt(i) == '(') {
                stack.push('(');
                // 문자가 ')'일때는
            } else if (s.charAt(i) == ')') {
                // stack이 비어있는지 확인
                if (stack.isEmpty()) {
                    // 비어있는 상태라면 false
                    return false;
                }
                // 아니면 pop
                stack.pop();
            }
        }

        // stack이 비어있는지 아닌지 여부를 boolean 형태로 반환
        return stack.isEmpty();
    }
}