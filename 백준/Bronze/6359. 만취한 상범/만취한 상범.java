import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {

      int n = Integer.parseInt(br.readLine());

      boolean[] windows = new boolean[n+1];
      Arrays.fill(windows, false);

      for (int j = 1; j <= n; j++) {
        for (int k = 1; j*k <= n; k++) {
          windows[j*k] = !windows[j*k];
        }
      }

      int count = 0;

      for (int j = 1; j <= n; j++) {
        if (windows[j]) {
          count++;
        }
      }

      sb.append(count).append("\n");
    }
    System.out.println(sb.toString());
  }
}