import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] prefixSum = new int[n+1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i-1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i <m; i++) {

            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(prefixSum[b] - prefixSum[a-1]).append("\n");

        }
        System.out.println(sb);
    }
}