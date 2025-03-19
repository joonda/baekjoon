import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        // [0, 0, 0, 0, 0, 0, ..., 0] x+1개의 배열 생성
        int[] dp = new int[x + 1];

        // 1일 때는 이미 계산이 필요없음.
        for (int i=2; i<=x; i++) {

            // 일단 -1부터 시작.
            dp[i] = dp[i-1] + 1;

            // 만약 i가 2로 나누어 진다면,
            if (i % 2 == 0) {
                // dp[i], dp[i/2]+1 두개 중에 최솟값을 찾는다.
                dp[i] = Math.min(dp[i], dp[i/2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i/3] + 1);
            }
        }
        System.out.println(dp[x]);
    }
}