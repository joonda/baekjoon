import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    // 해결 문제 수
    int N = Integer.parseInt(st.nextToken());
    // 유니온 레벨
    int U = Integer.parseInt(st.nextToken());
    // 최고레벨
    int L = Integer.parseInt(st.nextToken());

    if (N >= 1000) {
        if (U >= 8000 || L >= 260) {
            System.out.println("Very Good");
        } else {
            System.out.println("Good");
        }
    } else {
        System.out.println("Bad");
    }
  }
}