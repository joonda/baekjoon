import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());

    for (int i = 0; i < t; i++) {
      StringTokenizer st = new StringTokenizer(br.readLine());

      int x1 = Integer.parseInt(st.nextToken());
      int y1 = Integer.parseInt(st.nextToken());
      int r1 = Integer.parseInt(st.nextToken());
      int x2 = Integer.parseInt(st.nextToken());
      int y2 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());

      double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

      if (distance == 0) {
        if (r1 == r2) {
          System.out.println(-1);
        }
        else {
          System.out.println(0);
        }
      } else if (distance > r1 + r2) {
        System.out.println(0);
      } else if (distance < Math.abs(r1- r2)) {
        System.out.println(0);
      } else if (distance == r1 + r2) {
        System.out.println(1);
      } else if (distance == Math.abs(r1-r2)) {
        System.out.println(1);
      } else {
        System.out.println(2);
      }
    }
  }
}