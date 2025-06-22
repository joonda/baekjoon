import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        if (n <= 99) {
            System.out.println(n);
        } else {
            // 1~99 사이의 수는 모두 한수이다.
            int count = 99;
            for (int i = 100; i <= n; i++) {
                // 백의 자리, 십의 자리, 일의 자리를 각각 구한다.
                int a = i / 100;
                int b = (i / 10) % 10;
                int c = i % 10;

                // 각 자릿수의 차이를 구하고 이가 같을때 등차수열이 성립
                if ((a - b) == (b - c)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
