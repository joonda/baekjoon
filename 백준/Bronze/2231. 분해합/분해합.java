import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        for (int i=Math.max(1, N-9*String.valueOf(N).length()); i<N; i++) {
            int numberSum = i;
            int temp = i;

            while(temp > 0) {
                numberSum += temp % 10;
                temp /= 10;
            }
            if (numberSum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}