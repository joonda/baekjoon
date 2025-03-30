import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 숫자 i를 만들기 위한 최소 제곱수 갯수
        int[] arr = new int[n + 1];

        // arr 배열을 n까지 초기화 
        for (int i = 1; i <= n; i++) {
            arr[i] = i;

            // n까지 초기화하면서, 가능한 제곱수를구한다
            // 하나는 arr[i], 다른 하나는 i에 j의 제곱을 뺀 값 + 1
            for (int j = 0; j*j <= i; j++) {
                arr[i] = Math.min(arr[i], arr[i-j*j] + 1);
            }
        }

        System.out.println(arr[n]);
    }
}