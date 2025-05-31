import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            // n을 지정
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            // count 지정
            int count = 0;

            // n을 초과하고, n * 2보다는 적게 루핑
            for (int i = n+1; i <= 2 * n; i++) {
                // isPrime 플래그를 기본적으로 true 지정
                boolean isPrime = true;

                // i가 2보다 작으면 소수가 아니다
                if (i < 2) {
                    isPrime = false;
                } else {
                    // 2부터 루트 i까지 루핑
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        // i와 j를 나눴을 때 0이면 false.
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                // true 라면 소수이므로 count + 1
                if (isPrime) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}