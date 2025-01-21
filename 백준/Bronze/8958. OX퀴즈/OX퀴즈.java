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
            String line = st.nextToken();

            int sum = 0;
            int score = 0;
            for (int j=0; j<line.length(); j++) {
                char ch = line.charAt(j);
                if (ch == 'O') {
                    score++;
                    sum += score;
                } else {
                    score = 0;
                }
            }
            System.out.println(sum);
        }
    }
}