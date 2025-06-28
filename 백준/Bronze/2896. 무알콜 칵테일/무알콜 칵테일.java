import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    StringTokenizer st = new StringTokenizer(br.readLine());
    float orange = Integer.parseInt(st.nextToken());
    float apple = Integer.parseInt(st.nextToken());
    float pineapple = Integer.parseInt(st.nextToken());

    StringTokenizer st2 = new StringTokenizer(br.readLine());
    float i = Integer.parseInt(st2.nextToken());
    float j = Integer.parseInt(st2.nextToken());
    float k = Integer.parseInt(st2.nextToken());

    float min = Math.min(orange / i, Math.min(apple / j, pineapple / k));

    orange = orange - (i * min);
    apple = apple - (j * min);
    pineapple = pineapple - (k * min);

    System.out.printf("%.6f %.6f %.6f\n", orange, apple, pineapple);

  }
}