import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int steps = Integer.parseInt(br.readLine());
        int[] stepScore = new int[steps];
        for (int i = 0; i < steps; i++) {
            stepScore[i] = Integer.parseInt(br.readLine());
        }

        // 계단 개수가 1개일 때는, 그대로 출력
        if (steps == 1) {
            System.out.println(stepScore[0]);
            return;
            // 계단 개수가 2개일 때는 첫번째, 두번째 계단을 더함
        } else if (steps == 2) {
            System.out.println(stepScore[0] + stepScore[1]);
            return;
        }

        // dp 배열 선언
        // i번째 계단까지 올랐을 때 얻을 수 있는 최대 점수를 넣는 배열
        int[] dp = new int[steps];
        // 첫번째 최대값
        dp[0] = stepScore[0];
        // 두번째 까지의 최대값
        dp[1] = stepScore[0] + stepScore[1];
        // 세번째 까지의 최댓값은 첫번째 계단 -> 세번째 계단으로 넘어가거나
        // 첫번째 계단을 생략 후 두번째 계단 -> 세번째 계단으로 넘어가는 것 두가지이다.
        // 해당 두가지에서 제일 최대값을 넣는다.
        dp[2] = Math.max(stepScore[0] + stepScore[2], stepScore[1] + stepScore[2]);

        for (int i = 3; i < steps; i++) {
            // 이후에는 이전 계단에서 2칸을 건너뛰고 현재 계단을 오르는 경우
            // 아니면 두 칸을 연속으로 오르기 위해 3번째 전 계단에서 바로 점프를 하고, 이전 계단과 현재 계단을 오르는 경우
            // 해당 두가지에서 제일 최댓값을 넣는다
            dp[i] = Math.max(dp[i-2] + stepScore[i], dp[i-3] + stepScore[i-1] + stepScore[i]);
        }
        // steps-1 (제일 마지막) 원소 출력
        System.out.println(dp[steps-1]);
    }
}