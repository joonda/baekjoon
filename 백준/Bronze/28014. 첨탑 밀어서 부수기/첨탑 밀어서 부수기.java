import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] tower = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int h = Integer.parseInt(st.nextToken());
            tower[i] = h;
        }

        int count = 1;

        for (int i = 1; i < n; i++) {
            if (tower[i] >= tower[i - 1]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
