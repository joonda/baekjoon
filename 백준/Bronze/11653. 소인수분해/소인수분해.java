import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        br.close();

        if (N == 1) {
            return;
        }

        for (int i=2; i<=N; i++) {
            while (N % i == 0) {
                N /= i;
                sb.append(i + "\n");
            }
        }

        System.out.println(sb);
    }
}