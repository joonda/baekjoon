import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        // 1 <= k, n <= 14
        int[][] APT = new int[15][15];

        // 0층 1호~14호까지 1명씩 증가
        // 각 층의 1호는 1명.
        for (int i=0; i<15; i++) {
            APT[i][1] = 1;
            APT[0][i] = i;
        }

        // APT[1][2] = APT[0][2] + APT[1][1]
        for (int j=1; j<15; j++) {
            for (int k=2; k<15; k++) {
                APT[j][k] = APT[j-1][k] + APT[j][k-1];
            }
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());

            sb.append(APT[k][n] + "\n");
        }
        System.out.println(sb);
    }
}
