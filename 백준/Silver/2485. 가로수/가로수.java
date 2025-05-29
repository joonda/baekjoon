import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        // 가로수들이 일정 간격으로 있으려면, 모든 가로수 사이의 간격의 최대 공약수가 일정해야 한다.
        int n = Integer.parseInt(br.readLine());

        int[] trees = new int[n];

        for (int i=0; i<n; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(trees);

        /*
         * 처음 gcd를 구한 뒤, 이후 diff와 최대 공약수를 구하고 지속적으로 초기화
         * 즉 처음부터 마지막까지 diff 간의 최대 공약수를 구한다.
         * */
        int gcd = trees[1] - trees[0];

        for (int i = 2; i < n; i++) {
            int diff = trees[i] - trees[i-1];
            gcd = getGCD(gcd, diff);
        }

        /*
         * diff / gcd(최대공약수) - 1로 count를 더한다
         * 1, 3, 7 일시
         * 1, 3 사이 (3-1) / 2 - 1 = 0   * 3, 7 사이 (7-3) / 2 - 1 = 1
         * */
        int count = 0;
        for (int i = 1; i < n; i++) {
            int diff = trees[i] - trees[i-1];
            count += diff / gcd - 1;
        }

        System.out.println(count);
    }

    public static int getGCD (int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }
}