import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int s1 = Integer.parseInt(st.nextToken());
    int s2 = Integer.parseInt(st.nextToken());
    int s3 = Integer.parseInt(st.nextToken());

    // 합의 최댓값은 s1 + s2 + s3
    int[] count = new int[s1 + s2 + s3 + 1];
    
    for (int i = 1; i <= s1; i++) {
      for (int j = 1; j <= s2; j++) {
        for (int k = 1; k <= s3; k++) {
          count[i + j + k]++;
        }
      }
    }

    int max = 0;
    int result = 0;

    for (int i = 3; i <= s1 + s2 + s3; i++) {
      if (count[i] > max) {
        max = count[i];
        result = i;
      }
    }
    System.out.println(result);
  }
}