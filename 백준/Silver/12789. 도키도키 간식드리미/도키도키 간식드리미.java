import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 학생들의 수 입력
        int n = Integer.parseInt(br.readLine());

        // 학생 번호들 입력
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 실제 줄 (Queue): 학생들이 순서대로 줄 서 있음
        Queue<Integer> line = new LinkedList<>();

        // 보조 대기 공간 (Stack): 줄에서 빠졌지만 아직 간식을 못 받은 학생들
        Stack<Integer> waiting = new Stack<>();

        // 줄에 학생들을 입력된 순서대로 추가
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            line.offer(a);  // 큐의 끝에 추가
        }

        int expected = 1;  // 현재 간식을 받아야 할 학생 번호

        // 줄(line)이 빌 때까지 반복
        while (!line.isEmpty()) {
            if (line.peek() == expected) {
                // 줄 맨 앞의 학생이 간식을 받을 차례면 간식 주고 다음 번호로
                line.poll();  // 줄에서 제거
                expected++;
            } else if (!waiting.isEmpty() && waiting.peek() == expected) {
                // 대기 공간에 있는 학생이 받을 차례면 간식 주기
                waiting.pop();  // 스택에서 제거
                expected++;
            } else {
                // 받을 차례가 아닌 학생은 대기 공간으로 이동
                waiting.push(line.poll());  // 줄에서 꺼내 스택에 추가
            }
        }

        // 줄이 끝난 후, 대기 공간에 있는 학생들도 간식 줄 수 있는지 확인
        while (!waiting.isEmpty()) {
            if (waiting.peek() == expected) {
                // 받을 차례면 간식 주고 다음으로
                waiting.pop();
                expected++;
            } else {
                // 받을 차례가 아니면 더 이상 진행 불가
                break;
            }
        }

        // 대기 공간이 비었으면 성공적으로 간식 다 나눠준 것
        if (waiting.isEmpty()) {
            System.out.println("Nice");
        } else {
            // 남아 있으면 실패
            System.out.println("Sad");
        }
    }
}