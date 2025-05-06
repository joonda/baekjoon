import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int max = 0;

        for (int i = 1; i <= k; i++) {
            int a = n * i;
            String reversed = new StringBuilder(String.valueOf(a)).reverse().toString();
            int reversedNum = Integer.parseInt(reversed);
            if (reversedNum > max) {
                max = reversedNum;
            }
        }
        System.out.println(max);
    }
}