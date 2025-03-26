import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        // index가 1부터 시작하도록 진행
        int[] arr = new int[n+1];

        if (n == 1) {
            System.out.println(1);
            return;
        } else if (n == 2) {
            System.out.println(3);
            return;
        }
        // 1번째의 경우의 수는 1
        arr[1] = 1;

        // 2번째 경우의 수는 2
        arr[2] = 3;

        // 각각 10007로 나눈 나머지를 출력.
        for (int i=3; i<=n; i++) {
            arr[i] = (arr[i-1] + 2*arr[i-2]) % 10007;
        }

        System.out.println(arr[n]);
    }
}