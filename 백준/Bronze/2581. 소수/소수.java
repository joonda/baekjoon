import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        int sum = 0;
        int min = M;

        for (int i=N; i<=M; i++) {
            List<Integer> arr = new ArrayList<>();
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    arr.add(j);
                }
            }
            if (arr.size() == 2) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}