import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int i=1; i<=T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            boolean flag = false;
            int cnt = 1;
            for (int j=1; j<=W; j++) {
                for (int k=1; k<=H; k++) {
                    if (cnt == N) {
                        System.out.printf("%d%02d\n", k,j);
                        flag = true;
                        break;
                    } else {
                        cnt++;
                    }
                }
                if (flag) break;
            }
        }
    }
}