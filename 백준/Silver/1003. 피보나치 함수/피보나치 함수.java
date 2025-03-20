import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        int[] testCase = new int[t];
        int max = 0;

        for (int i=0; i<t; i++) {
            testCase[i] = Integer.parseInt(br.readLine());
            if (testCase[i] > max) {
                max = testCase[i];
            }
        }

        int[][] dp = new int[max+1][2];

        dp[0][0] = 1;
        dp[0][1] = 0;

        if (max > 0) {
            dp[1][0] = 0;
            dp[1][1] = 1;
        }

        for (int i = 2; i<= max; i++) {
            dp[i][0] = dp[i-1][0] + dp[i-2][0];
            dp[i][1] = dp[i-1][1] + dp[i-2][1];
        }

        for (int n : testCase) {
            sb.append(dp[n][0]).append(" ").append(dp[n][1]).append("\n");
        }

        System.out.println(sb);
    }
}