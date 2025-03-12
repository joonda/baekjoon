import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[K];
        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        // 최소 길이 1
        long left = 1;
        // 최대 길이 (sort인 상태이기 때문에 맨 끝)
        long right = arr[K - 1];
        // 최적의 랜선 길이
        long answer = 0;

        // left가 right를 넘어가기 전까지
        while (left <= right) {
            // 중간 길이 값을 지정
            long mid = (left + right) / 2;
            
            // 각 랜선의 개수
            long count = 0;

            // 각 랜선의 길이를 mid로 나눈 값을 count에 담는다
            // 최적의 랜선 길이를 찾아주는 것
            for (int i = 0; i < K; i++) {
                count += arr[i] / mid;
            }

            // 랜선 길이 개수가 충분하다면
            if (count >= N) {
                // 최적의 랜선 길이를 mid로 지정
                answer = mid;
                // 왼쪽 랜선 길이를 mid보다 + 1
                left = mid + 1;
            } else {
                // 개수가 부족하면 길이를 줄인다.
                right = mid - 1;
            }
        }

        System.out.println(answer);
    }
}
