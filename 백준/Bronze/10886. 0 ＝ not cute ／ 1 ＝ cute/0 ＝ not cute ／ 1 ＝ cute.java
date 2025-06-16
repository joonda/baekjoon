import java.io.BufferedReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    int countZero = 0;
    int countOne = 0;

    for (int i = 0; i< N; i++) {
        int K = Integer.parseInt(br.readLine());

        if (K == 0) {
            countZero++;
        } else {
            countOne++;
        }
    }

    if (countZero > countOne) {
        System.out.println("Junhee is not cute!");
    } else {
        System.out.println("Junhee is cute!");
    }
  }
}