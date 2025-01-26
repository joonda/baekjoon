import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> arr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int count = 0;
        for (int i=1; i<=N; i++) {
            if (N % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}