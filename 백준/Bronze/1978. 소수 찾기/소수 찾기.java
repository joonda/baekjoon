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
        int count = 0;
        for (int i=1; i<=N; i++){
            int num = Integer.parseInt(st.nextToken());
            List<Integer> arr = new ArrayList<>();
            for (int j=1; j<=num; j++) {
                if (num % j == 0) {
                    arr.add(j);
                }
            }
            if (arr.size() == 2) {
                count++;
            }
        }
        System.out.println(count);
    }
}