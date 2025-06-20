import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int R = Integer.parseInt(st.nextToken());
    int C = Integer.parseInt(st.nextToken());
    int ZR = Integer.parseInt(st.nextToken());
    int ZC = Integer.parseInt(st.nextToken());

    for (int r = 0; r < R; r++) {
      String line = br.readLine();
      StringBuilder sb = new StringBuilder();

      for (char c : line.toCharArray()) {
        for (int i = 0; i < ZC; i++) {
          sb.append(c);
        }
      }
      for (int i = 0; i < ZR; i++) {
        System.out.println(sb.toString());
      }
    }
  }
}