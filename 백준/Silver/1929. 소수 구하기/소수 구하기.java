import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        // 소수를 구하는 boolean 배열을 선언
        // N까지 범위에 포함시켜야하기 때문에, N+1까지로 지정
        boolean[] isPrime = new boolean[N + 1];

        // isPrime을 모두 true로 설정
        Arrays.fill(isPrime, true);

        // 0, 1은 소수가 아니기 때문에 false 처리
        isPrime[0] = isPrime[1] = false;

        // 2부터 루트 N까지 반복
        // 루트 N인 이유는 에라토스테네스의 체에서는 i * i를 해서 배수를 지워나가는 방식이다.
        // 하지만 N이 만약 16이라고 가정할 시, i값이 5가 되버리는 순간, 25 > 16 으로 범위가 넘어가버리고, 검사의 필요성이 사라짐
        // 즉, 루트 N까지로 범위를 제한하는 것
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // 만약 isPrime[i]가 true일 경우
            if (isPrime[i]) {
                // j는 i * i 부터 시작, i를 순차적으로 더한다.
                // j는 즉 i의 배수를 false 처리하는 것
                // e.g. i=2, 4,6,8,10, ...
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // M과 N 사이의 boolean 배열의 값이 true일 경우, 출력
        for (int i=M; i<=N; i++){
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}