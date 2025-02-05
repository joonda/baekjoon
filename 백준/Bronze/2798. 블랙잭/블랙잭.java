import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] cardArr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cardArr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cardArr); // 정렬 필수

        int max = 0;

        for (int i = 0; i < N - 2; i++) {  // 첫 번째 카드 고정
            int left = i + 1;  // 두 번째 카드 포인터
            int right = N - 1; // 세 번째 카드 포인터

            while (left < right) {
                int sum = cardArr[i] + cardArr[left] + cardArr[right];

                if (sum == M) { // 정확히 M이면 바로 종료
                    System.out.println(M);
                    return;
                }

                if (sum < M) { // 최대값 갱신
                    max = Math.max(max, sum);
                    left++; // 합을 키우기 위해 left 증가
                } else {
                    right--; // 합을 줄이기 위해 right 감소
                }
            }
        }

        System.out.println(max);
    }
}
