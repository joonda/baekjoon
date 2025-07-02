import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int K = Integer.parseInt(st.nextToken());

    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      st = new StringTokenizer(br.readLine());
      int Ai = Integer.parseInt(st.nextToken());
      int Bi = Integer.parseInt(st.nextToken());

      arr[i] = Bi - Ai;
    }

    Arrays.sort(arr);

    System.out.println(Math.max(0, arr[K - 1]));
  }
}