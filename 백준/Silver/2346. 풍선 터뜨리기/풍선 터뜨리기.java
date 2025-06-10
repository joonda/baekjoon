import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Balloon {
    int number;
    int move;

    public Balloon(int number, int move) {
        this.number = number;
        this.move = move;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Balloon> balloons = new ArrayDeque<>();
        // 순서, 이동 수를 저장
        for (int i = 0; i < n; i++) {
            balloons.add(new Balloon(i + 1, Integer.parseInt(st.nextToken())));
        }

        // 현재 위치를 꺼낸다 (첫번째)
        Balloon current = balloons.pollFirst();
        System.out.print(current.number + " ");

        // 첫번째 위치의 이동 수를 꺼낸다
        int move = current.move;

        while (!balloons.isEmpty()) {
            // 만약 move가 0보다 크다면
            if (move > 0) {
                // 해당 이동 수의 -1까지 pollFirst한 숫자를 맨 뒤로 보낸다
                for (int i = 0; i < move - 1; i++) {
                    balloons.addLast(balloons.pollFirst());
                }
                // 만약 move가 0보다 작다면
            } else {
                // 해당 이동 수의 절대값 만큼 뒤에서 앞으로 추가
                for (int i = 0; i < Math.abs(move); i++) {
                    balloons.addFirst(balloons.pollLast());
                }
            }
            // 현재 current를 다시 추출
            current = balloons.pollFirst();
            // number를 출력 후 move를 재지정 
            // 해당 balloons 배열이 empty가 될때까지 반복
            System.out.print(current.number + " ");
            move = current.move;
        }
    }
}