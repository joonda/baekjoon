import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[][] cost = new int[n][3];
    int[][] dp = new int[n][3];

    for (int i = 0; i < n; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      for (int j = 0; j < 3; j++) {
        cost[i][j] = Integer.parseInt(st.nextToken());
      }
    }

    dp[0][0] = cost[0][0];
    dp[0][1] = cost[0][1];
    dp[0][2] = cost[0][2];
    
    for (int i = 1; i < n; i++) {
      dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + cost[i][0];
      dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + cost[i][1];
      dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + cost[i][2];
    }
    
    int result = Math.min(dp[n - 1][0], Math.min(dp[n - 1][1], dp[n - 1][2]));
    System.out.println(result);
  }
}