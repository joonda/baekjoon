import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        // 테스트 케이스 선언
        int t = Integer.parseInt(br.readLine());

        // 2 <= N <= 1000000
        int N = 1000000;

        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (isPrime[j] && isPrime[n - j]) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}