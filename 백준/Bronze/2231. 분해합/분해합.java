import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        for (int i=1; i<=N; i++) {
            String str_num = String.valueOf(i);
            int numberSum = 0;
            for (int j=0; j<str_num.length(); j++) {
                int number = str_num.charAt(j) - '0';
                numberSum += number;
            }
            int decompositionSum = i + numberSum;
            if (decompositionSum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}